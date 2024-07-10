package com.dao;

import com.entity.JiangchengjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiangchengjiluView;

/**
 * 奖惩记录 Dao 接口
 *
 * @author 
 */
public interface JiangchengjiluDao extends BaseMapper<JiangchengjiluEntity> {

   List<JiangchengjiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
