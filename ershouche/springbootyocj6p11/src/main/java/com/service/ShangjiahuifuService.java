package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangjiahuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangjiahuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangjiahuifuView;


/**
 * 商家回复
 *
 * @author 
 * @email 
 * @date 2024-02-23 10:15:16
 */
public interface ShangjiahuifuService extends IService<ShangjiahuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangjiahuifuVO> selectListVO(Wrapper<ShangjiahuifuEntity> wrapper);
   	
   	ShangjiahuifuVO selectVO(@Param("ew") Wrapper<ShangjiahuifuEntity> wrapper);
   	
   	List<ShangjiahuifuView> selectListView(Wrapper<ShangjiahuifuEntity> wrapper);
   	
   	ShangjiahuifuView selectView(@Param("ew") Wrapper<ShangjiahuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangjiahuifuEntity> wrapper);

   	

}

