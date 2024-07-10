package com.dao;

import com.entity.ZhiburizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiburizhiView;

/**
 * 支部日志 Dao 接口
 *
 * @author 
 */
public interface ZhiburizhiDao extends BaseMapper<ZhiburizhiEntity> {

   List<ZhiburizhiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
