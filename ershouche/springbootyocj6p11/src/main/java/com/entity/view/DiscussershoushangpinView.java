package com.entity.view;

import com.entity.DiscussershoushangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 二手汽车评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-23 10:15:17
 */
@TableName("discussershoushangpin")
public class DiscussershoushangpinView  extends DiscussershoushangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussershoushangpinView(){
	}
 
 	public DiscussershoushangpinView(DiscussershoushangpinEntity discussershoushangpinEntity){
 	try {
			BeanUtils.copyProperties(this, discussershoushangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
