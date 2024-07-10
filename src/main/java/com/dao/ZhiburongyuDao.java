package com.dao;

import com.entity.ZhiburongyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiburongyuView;

/**
 * 支部荣誉 Dao 接口
 *
 * @author 
 */
public interface ZhiburongyuDao extends BaseMapper<ZhiburongyuEntity> {

   List<ZhiburongyuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
