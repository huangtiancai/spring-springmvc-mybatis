package com.htc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.htc.pojo.Item;

//注意：Controller:后端控制器 Controller执行完成后返回ModelAndView
//1.组件扫描器---->需要在类上添加@Controller注解，把Controller交由Spring管理
//2.配置处理器映射器:
//注解式处理器映射器:对类中标记了@ResquestMapping的方法进行映射
//				根据@ResquestMapping定义的url匹配@ResquestMapping标记的方法,匹配成功返回HandlerMethod对象给前端控制器。
//				HandlerMethod对象中封装url对应的方法Method


//在方法上面添加@RequestMapping注解，里面指定请求的url。其中“.action”可以加也可以不加。

public class ItemController {
	@RequestMapping("/itemList.action")
	public ModelAndView queryItemList(){
		//创建页面需显示的商品数据
		List<Item> list = new ArrayList<>();
		//new Item(1, "1华为 荣耀8", 2999.00 new Date(), "质量好！1")
		list.add(new Item(1, "1华为 荣耀8", 2999.99, new Date(), "1质量非常好！"));
		list.add(new Item(2, "1华为 荣耀8", 2999.99, new Date(), "1质量非常好！"));
		list.add(new Item(3, "1华为 荣耀8", 2999.99, new Date(), "1质量非常好！"));
		list.add(new Item(4, "1华为 荣耀8", 2999.99, new Date(), "1质量非常好！"));
		list.add(new Item(5, "1华为 荣耀8", 2999.99, new Date(), "1质量非常好！"));
		list.add(new Item(6, "1华为 荣耀8", 2999.99, new Date(), "1质量非常好！"));
		
		//创建ModelAndView,用来存放数据和视图
		ModelAndView mv =new ModelAndView();
		
		//设置数据（商品数据）到模型中	
		mv.addObject("itemList", list);
		//设置跳转页面地址（设置视图jsp,需要设置视图的物理地址）
		mv.setViewName("/WEB-INF/jsp/itemList.jsp");
		//返回一个模型
		return mv;
		//HandlerAdapter将controller执行结果ModelAndView返回给DispatcherServlet		
	}
}
