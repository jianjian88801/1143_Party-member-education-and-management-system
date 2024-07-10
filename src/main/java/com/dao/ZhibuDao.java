package com.dao;

import com.entity.ZhibuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhibuView;

/**
 * 支部 Dao 接口
 *
 * @author 
 */
public interface ZhibuDao extends BaseMapper<ZhibuEntity> {

   List<ZhibuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
