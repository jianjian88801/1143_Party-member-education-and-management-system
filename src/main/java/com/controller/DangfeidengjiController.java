
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
 * 党费登记
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/dangfeidengji")
public class DangfeidengjiController {
    private static final Logger logger = LoggerFactory.getLogger(DangfeidengjiController.class);

    @Autowired
    private DangfeidengjiService dangfeidengjiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private ZhibuService zhibuService;

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
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = dangfeidengjiService.queryPage(params);

        //字典表数据转换
        List<DangfeidengjiView> list =(List<DangfeidengjiView>)page.getList();
        for(DangfeidengjiView c:list){
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
        DangfeidengjiEntity dangfeidengji = dangfeidengjiService.selectById(id);
        if(dangfeidengji !=null){
            //entity转view
            DangfeidengjiView view = new DangfeidengjiView();
            BeanUtils.copyProperties( dangfeidengji , view );//把实体数据重构到view中

                //级联表
                ZhibuEntity zhibu = zhibuService.selectById(dangfeidengji.getZhibuId());
                if(zhibu != null){
                    BeanUtils.copyProperties( zhibu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setZhibuId(zhibu.getId());
                }
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
    public R save(@RequestBody DangfeidengjiEntity dangfeidengji, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,dangfeidengji:{}",this.getClass().getName(),dangfeidengji.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("支部".equals(role))
            dangfeidengji.setZhibuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<DangfeidengjiEntity> queryWrapper = new EntityWrapper<DangfeidengjiEntity>()
            .eq("zhibu_id", dangfeidengji.getZhibuId())
            .eq("dangfeidengji_name", dangfeidengji.getDangfeidengjiName())
            .eq("dangfeidengji_types", dangfeidengji.getDangfeidengjiTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DangfeidengjiEntity dangfeidengjiEntity = dangfeidengjiService.selectOne(queryWrapper);
        if(dangfeidengjiEntity==null){
            dangfeidengji.setCreateTime(new Date());
            dangfeidengjiService.insert(dangfeidengji);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody DangfeidengjiEntity dangfeidengji, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,dangfeidengji:{}",this.getClass().getName(),dangfeidengji.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("支部".equals(role))
//            dangfeidengji.setZhibuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<DangfeidengjiEntity> queryWrapper = new EntityWrapper<DangfeidengjiEntity>()
            .notIn("id",dangfeidengji.getId())
            .andNew()
            .eq("zhibu_id", dangfeidengji.getZhibuId())
            .eq("dangfeidengji_name", dangfeidengji.getDangfeidengjiName())
            .eq("dangfeidengji_types", dangfeidengji.getDangfeidengjiTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DangfeidengjiEntity dangfeidengjiEntity = dangfeidengjiService.selectOne(queryWrapper);
        if(dangfeidengjiEntity==null){
            dangfeidengjiService.updateById(dangfeidengji);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        dangfeidengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<DangfeidengjiEntity> dangfeidengjiList = new ArrayList<>();//上传的东西
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
                            DangfeidengjiEntity dangfeidengjiEntity = new DangfeidengjiEntity();
//                            dangfeidengjiEntity.setZhibuId(Integer.valueOf(data.get(0)));   //所在支部 要改的
//                            dangfeidengjiEntity.setDangfeidengjiName(data.get(0));                    //缴纳金额 要改的
//                            dangfeidengjiEntity.setDangfeidengjiTypes(Integer.valueOf(data.get(0)));   //是否支付 要改的
//                            dangfeidengjiEntity.setDangfeidengjiTime(new Date(data.get(0)));          //登记日期 要改的
//                            dangfeidengjiEntity.setCreateTime(date);//时间
                            dangfeidengjiList.add(dangfeidengjiEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        dangfeidengjiService.insertBatch(dangfeidengjiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
