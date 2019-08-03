package com.htc.handler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.htc.pojo.Item;

/**  
* @ClassName:ItesmHandler
* @Description: 编写Handler类,实现 Controller接口
* @author:htc  
* @date:2019年8月1日 下午11:13:50
*/
public class ItesmHandler implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
			throws Exception {
		System.out.println("进入ItesmHandler");
		List<Item> list = new ArrayList<Item>();
		list.add(new Item(1, "夏明1", 99.99, new Date(), "哈哈"));
		list.add(new Item(2, "夏明2", 99.99, new Date(), "哈哈"));
		list.add(new Item(3, "夏明3", 99.99, new Date(), "哈哈"));
		//创建ModelAndView,用来存放数据和视图
		ModelAndView mv = new ModelAndView();
		//添加数据到模型
		mv.addObject("itemList",list);
		//添加视图
		mv.setViewName("/index.jsp");
		//返回一个模型
		//默认转发
		return mv;
		
		//访问 http://localhost:8080/springMVC-01/selectItems.action
	}

}
