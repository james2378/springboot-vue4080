package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ErshoushangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ErshoushangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ErshoushangpinView;


/**
 * 二手汽车
 *
 * @author 
 * @email 
 * @date 2024-02-23 10:15:16
 */
public interface ErshoushangpinService extends IService<ErshoushangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ErshoushangpinVO> selectListVO(Wrapper<ErshoushangpinEntity> wrapper);
   	
   	ErshoushangpinVO selectVO(@Param("ew") Wrapper<ErshoushangpinEntity> wrapper);
   	
   	List<ErshoushangpinView> selectListView(Wrapper<ErshoushangpinEntity> wrapper);
   	
   	ErshoushangpinView selectView(@Param("ew") Wrapper<ErshoushangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ErshoushangpinEntity> wrapper);

   	

}

