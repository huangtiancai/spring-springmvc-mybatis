/**
 * 
 */
package com.htc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.htc.pojo.Item;
import com.htc.service.ItemService;

/**  
* @ClassName:ItemController
* @Description:
* @author:htc  
* @date:2019年8月12日 下午11:48:02
*/
@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/itemList.action")
	public ModelAndView queryItemList(){
		System.out.println("进入queryItemList");
		
		//获取商品数据
		List<Item> list = itemService.queryItemList();
		
		//创建ModelAndView,用来存放数据和视图
		ModelAndView mv = new ModelAndView();
		//添加数据到模型
		mv.addObject("itemList",list);
		//添加视图
		mv.setViewName("itemList");
		
		return mv;	
	}
	//http://localhost:8080/springMVC-MyBatis/itemList.action	
}
