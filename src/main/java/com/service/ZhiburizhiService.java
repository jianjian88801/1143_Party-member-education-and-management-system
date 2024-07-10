package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiburizhiEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 支部日志 服务类
 */
public interface ZhiburizhiService extends IService<ZhiburizhiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}