
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 支部
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/zhibu")
public class ZhibuController {
    private static final Logger logger = LoggerFactory.getLogger(ZhibuController.class);

    @Autowired
    private ZhibuService zhibuService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("党员".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("支部".equals(role))
            params.put("zhibuId",request.getSession().getAttribute("userId"));
        params.put("zhibuDeleteStart",1);params.put("zhibuDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = zhibuService.queryPage(params);

        //字典表数据转换
        List<ZhibuView> list =(List<ZhibuView>)page.getList();
        for(ZhibuView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZhibuEntity zhibu = zhibuService.selectById(id);
        if(zhibu !=null){
            //entity转view
            ZhibuView view = new ZhibuView();
            BeanUtils.copyProperties( zhibu , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ZhibuEntity zhibu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zhibu:{}",this.getClass().getName(),zhibu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ZhibuEntity> queryWrapper = new EntityWrapper<ZhibuEntity>()
            .eq("username", zhibu.getUsername())
            .or()
            .eq("zhibu_phone", zhibu.getZhibuPhone())
            .andNew()
            .eq("zhibu_delete", 1)
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhibuEntity zhibuEntity = zhibuService.selectOne(queryWrapper);
        if(zhibuEntity==null){
            zhibu.setZhibuDelete(1);
            zhibu.setCreateTime(new Date());
            zhibu.setPassword("123456");
            zhibuService.insert(zhibu);
            return R.ok();
        }else {
            return R.error(511,"账户或者联系方式已经被使用");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZhibuEntity zhibu, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,zhibu:{}",this.getClass().getName(),zhibu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<ZhibuEntity> queryWrapper = new EntityWrapper<ZhibuEntity>()
            .notIn("id",zhibu.getId())
            .andNew()
            .eq("username", zhibu.getUsername())
            .or()
            .eq("zhibu_phone", zhibu.getZhibuPhone())
            .andNew()
            .eq("zhibu_delete", 1)
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhibuEntity zhibuEntity = zhibuService.selectOne(queryWrapper);
        if(zhibuEntity==null){
            zhibuService.updateById(zhibu);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"账户或者联系方式已经被使用");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<ZhibuEntity> list = new ArrayList<>();
        for(Integer id:ids){
            ZhibuEntity zhibuEntity = new ZhibuEntity();
            zhibuEntity.setId(id);
            zhibuEntity.setZhibuDelete(2);
            list.add(zhibuEntity);
        }
        if(list != null && list.size() >0){
            zhibuService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<ZhibuEntity> zhibuList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ZhibuEntity zhibuEntity = new ZhibuEntity();
//                            zhibuEntity.setUsername(data.get(0));                    //账户 要改的
//                            //zhibuEntity.setPassword("123456");//密码
//                            zhibuEntity.setZhibuName(data.get(0));                    //负责人姓名 要改的
//                            zhibuEntity.setZhibuDangzhibu(data.get(0));                    //党支部 要改的
//                            zhibuEntity.setZhibuPhone(data.get(0));                    //联系方式 要改的
//                            zhibuEntity.setZhibuAddress(data.get(0));                    //办公地址 要改的
//                            zhibuEntity.setZhibuEmail(data.get(0));                    //邮箱 要改的
//                            zhibuEntity.setZhibuContent("");//照片
//                            zhibuEntity.setZhibuDelete(1);//逻辑删除字段
//                            zhibuEntity.setCreateTime(date);//时间
                            zhibuList.add(zhibuEntity);


                            //把要查询是否重复的字段放入map中
                                //账户
                                if(seachFields.containsKey("username")){
                                    List<String> username = seachFields.get("username");
                                    username.add(data.get(0));//要改的
                                }else{
                                    List<String> username = new ArrayList<>();
                                    username.add(data.get(0));//要改的
                                    seachFields.put("username",username);
                                }
                                //联系方式
                                if(seachFields.containsKey("zhibuPhone")){
                                    List<String> zhibuPhone = seachFields.get("zhibuPhone");
                                    zhibuPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> zhibuPhone = new ArrayList<>();
                                    zhibuPhone.add(data.get(0));//要改的
                                    seachFields.put("zhibuPhone",zhibuPhone);
                                }
                        }

                        //查询是否重复
                         //账户
                        List<ZhibuEntity> zhibuEntities_username = zhibuService.selectList(new EntityWrapper<ZhibuEntity>().in("username", seachFields.get("username")).eq("zhibu_delete", 1));
                        if(zhibuEntities_username.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ZhibuEntity s:zhibuEntities_username){
                                repeatFields.add(s.getUsername());
                            }
                            return R.error(511,"数据库的该表中的 [账户] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //联系方式
                        List<ZhibuEntity> zhibuEntities_zhibuPhone = zhibuService.selectList(new EntityWrapper<ZhibuEntity>().in("zhibu_phone", seachFields.get("zhibuPhone")).eq("zhibu_delete", 1));
                        if(zhibuEntities_zhibuPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ZhibuEntity s:zhibuEntities_zhibuPhone){
                                repeatFields.add(s.getZhibuPhone());
                            }
                            return R.error(511,"数据库的该表中的 [联系方式] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        zhibuService.insertBatch(zhibuList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }


    /**
    * 登录
    */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        ZhibuEntity zhibu = zhibuService.selectOne(new EntityWrapper<ZhibuEntity>().eq("username", username));
        if(zhibu==null || !zhibu.getPassword().equals(password))
            return R.error("账号或密码不正确");
        else if(zhibu.getZhibuDelete() != 1)
            return R.error("账户已被删除");
        //  // 获取监听器中的字典表
        // ServletContext servletContext = ContextLoader.getCurrentWebApplicationContext().getServletContext();
        // Map<String, Map<Integer, String>> dictionaryMap= (Map<String, Map<Integer, String>>) servletContext.getAttribute("dictionaryMap");
        // Map<Integer, String> role_types = dictionaryMap.get("role_types");
        // role_types.get(.getRoleTypes());
        String token = tokenService.generateToken(zhibu.getId(),username, "zhibu", "支部");
        R r = R.ok();
        r.put("token", token);
        r.put("role","支部");
        r.put("username",zhibu.getZhibuName());
        r.put("tableName","zhibu");
        r.put("userId",zhibu.getId());
        return r;
    }

    /**
    * 注册
    */
    @IgnoreAuth
    @PostMapping(value = "/register")
    public R register(@RequestBody ZhibuEntity zhibu){
//    	ValidatorUtils.validateEntity(user);
        Wrapper<ZhibuEntity> queryWrapper = new EntityWrapper<ZhibuEntity>()
            .eq("username", zhibu.getUsername())
            .or()
            .eq("zhibu_phone", zhibu.getZhibuPhone())
            .andNew()
            .eq("zhibu_delete", 1)
            ;
        ZhibuEntity zhibuEntity = zhibuService.selectOne(queryWrapper);
        if(zhibuEntity != null)
            return R.error("账户或者联系方式已经被使用");
        zhibu.setZhibuDelete(1);
        zhibu.setCreateTime(new Date());
        zhibuService.insert(zhibu);
        return R.ok();
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  id){
        ZhibuEntity zhibu = new ZhibuEntity();
        zhibu.setPassword("123456");
        zhibu.setId(id);
        zhibuService.updateById(zhibu);
        return R.ok();
    }


    /**
     * 忘记密码
     */
    @IgnoreAuth
    @RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request) {
        ZhibuEntity zhibu = zhibuService.selectOne(new EntityWrapper<ZhibuEntity>().eq("username", username));
        if(zhibu!=null){
            zhibu.setPassword("123456");
            boolean b = zhibuService.updateById(zhibu);
            if(!b){
               return R.error();
            }
        }else{
           return R.error("账号不存在");
        }
        return R.ok();
    }


    /**
    * 获取用户的session用户信息
    */
    @RequestMapping("/session")
    public R getCurrZhibu(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        ZhibuEntity zhibu = zhibuService.selectById(id);
        if(zhibu !=null){
            //entity转view
            ZhibuView view = new ZhibuView();
            BeanUtils.copyProperties( zhibu , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }
    }


    /**
    * 退出
    */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
    }





}
