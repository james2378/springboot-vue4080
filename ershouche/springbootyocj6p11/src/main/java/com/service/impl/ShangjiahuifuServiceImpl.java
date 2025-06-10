package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShangjiahuifuDao;
import com.entity.ShangjiahuifuEntity;
import com.service.ShangjiahuifuService;
import com.entity.vo.ShangjiahuifuVO;
import com.entity.view.ShangjiahuifuView;

@Service("shangjiahuifuService")
public class ShangjiahuifuServiceImpl extends ServiceImpl<ShangjiahuifuDao, ShangjiahuifuEntity> implements ShangjiahuifuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangjiahuifuEntity> page = this.selectPage(
                new Query<ShangjiahuifuEntity>(params).getPage(),
                new EntityWrapper<ShangjiahuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangjiahuifuEntity> wrapper) {
		  Page<ShangjiahuifuView> page =new Query<ShangjiahuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShangjiahuifuVO> selectListVO(Wrapper<ShangjiahuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangjiahuifuVO selectVO(Wrapper<ShangjiahuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangjiahuifuView> selectListView(Wrapper<ShangjiahuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangjiahuifuView selectView(Wrapper<ShangjiahuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
