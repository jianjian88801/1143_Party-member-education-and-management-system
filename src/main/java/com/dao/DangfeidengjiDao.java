package com.dao;

import com.entity.DangfeidengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DangfeidengjiView;

/**
 * 党费登记 Dao 接口
 *
 * @author 
 */
public interface DangfeidengjiDao extends BaseMapper<DangfeidengjiEntity> {

   List<DangfeidengjiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
