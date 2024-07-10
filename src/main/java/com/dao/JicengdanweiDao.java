package com.dao;

import com.entity.JicengdanweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JicengdanweiView;

/**
 * 基层单位 Dao 接口
 *
 * @author 
 */
public interface JicengdanweiDao extends BaseMapper<JicengdanweiEntity> {

   List<JicengdanweiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
