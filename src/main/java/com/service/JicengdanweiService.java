package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JicengdanweiEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 基层单位 服务类
 */
public interface JicengdanweiService extends IService<JicengdanweiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}