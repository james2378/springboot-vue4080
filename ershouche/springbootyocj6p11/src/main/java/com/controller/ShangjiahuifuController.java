package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShangjiahuifuEntity;
import com.entity.view.ShangjiahuifuView;

import com.service.ShangjiahuifuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 商家回复
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-23 10:15:16
 */
@RestController
@RequestMapping("/shangjiahuifu")
public class ShangjiahuifuController {
    @Autowired
    private ShangjiahuifuService shangjiahuifuService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShangjiahuifuEntity shangjiahuifu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			shangjiahuifu.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			shangjiahuifu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShangjiahuifuEntity> ew = new EntityWrapper<ShangjiahuifuEntity>();

		PageUtils page = shangjiahuifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangjiahuifu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShangjiahuifuEntity shangjiahuifu, 
		HttpServletRequest request){
        EntityWrapper<ShangjiahuifuEntity> ew = new EntityWrapper<ShangjiahuifuEntity>();

		PageUtils page = shangjiahuifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangjiahuifu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShangjiahuifuEntity shangjiahuifu){
       	EntityWrapper<ShangjiahuifuEntity> ew = new EntityWrapper<ShangjiahuifuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shangjiahuifu, "shangjiahuifu")); 
        return R.ok().put("data", shangjiahuifuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShangjiahuifuEntity shangjiahuifu){
        EntityWrapper< ShangjiahuifuEntity> ew = new EntityWrapper< ShangjiahuifuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shangjiahuifu, "shangjiahuifu")); 
		ShangjiahuifuView shangjiahuifuView =  shangjiahuifuService.selectView(ew);
		return R.ok("查询商家回复成功").put("data", shangjiahuifuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShangjiahuifuEntity shangjiahuifu = shangjiahuifuService.selectById(id);
        return R.ok().put("data", shangjiahuifu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShangjiahuifuEntity shangjiahuifu = shangjiahuifuService.selectById(id);
        return R.ok().put("data", shangjiahuifu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShangjiahuifuEntity shangjiahuifu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shangjiahuifu);
        shangjiahuifuService.insert(shangjiahuifu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShangjiahuifuEntity shangjiahuifu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shangjiahuifu);
        shangjiahuifuService.insert(shangjiahuifu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShangjiahuifuEntity shangjiahuifu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shangjiahuifu);
        shangjiahuifuService.updateById(shangjiahuifu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shangjiahuifuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
