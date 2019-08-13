/**
 * 
 */
package com.htc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.htc.pojo.Item;
import com.htc.pojo.QueryVO;
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
	
	/**
	 * @describe 包装类型 绑定 数组类型，可以使用两种方式，pojo的属性接收，和直接接收
	 * @author ks0pc23-PC 
	 * @date 2019年8月13日 下午4:09:26
	 * @param queryvo
	 * @return
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping("/queryItem")
	public String queryItem(QueryVO queryvo,Integer[] ids){
		System.out.println("进入queryItem");
		
		System.out.println(queryvo);
		System.out.println(queryvo.getItem().getId());
		System.out.println(queryvo.getItem().getName());
		
		System.out.println(queryvo.getIds());
		System.out.println(queryvo.getIds().length);
		
		System.out.println(ids);
		System.out.println(ids.length);
		
		//返回逻辑视图
		return "success";	
	}
	
	
	//@RequestMapping
	//@RequestMapping注解可以定义不同的处理器映射规则:
	//1.URL路径映射
	//@RequestMapping(value="item")或@RequestMapping("/item"）
	//value的值是数组，可以将多个url映射到同一个方法
	
	
	/**
	 * 
	 * @describe 显示商品列表
	 * @author ks0pc23-PC 
	 * @date 2019年8月13日 下午2:11:40
	 * @return
	 * @return ModelAndView
	 * @throws Exception
	 */
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
	//http://localhost:8080/springMVC-MyBatis/itemEdit.action?id=1
	
	
	
	
}
