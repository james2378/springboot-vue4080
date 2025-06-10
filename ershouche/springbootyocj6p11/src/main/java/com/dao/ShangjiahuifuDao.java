package com.dao;

import com.entity.ShangjiahuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangjiahuifuVO;
import com.entity.view.ShangjiahuifuView;


/**
 * 商家回复
 * 
 * @author 
 * @email 
 * @date 2024-02-23 10:15:16
 */
public interface ShangjiahuifuDao extends BaseMapper<ShangjiahuifuEntity> {
	
	List<ShangjiahuifuVO> selectListVO(@Param("ew") Wrapper<ShangjiahuifuEntity> wrapper);
	
	ShangjiahuifuVO selectVO(@Param("ew") Wrapper<ShangjiahuifuEntity> wrapper);
	
	List<ShangjiahuifuView> selectListView(@Param("ew") Wrapper<ShangjiahuifuEntity> wrapper);

	List<ShangjiahuifuView> selectListView(Pagination page,@Param("ew") Wrapper<ShangjiahuifuEntity> wrapper);

	
	ShangjiahuifuView selectView(@Param("ew") Wrapper<ShangjiahuifuEntity> wrapper);
	

}
