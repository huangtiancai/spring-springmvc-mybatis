package com.htc.handler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.htc.pojo.Item;

/**  
* @ClassName:ItesmHandler
* @Description: 注解开发Handler(这里的ItemController是一个普通的java类),不需要实现任何接口
* @author:htc  
* @date:2019年8月1日 下午11:13:50
*/
//1.标识此类是一个handler（控制器）-spring中的注解：标示此类是一个controller(控制层)
//2.在类上添加@Controller注解，把Controller交由Spring管理
//3.在方法上面添加@RequestMapping注解，里面指定请求的url,和用户请求的url进行匹配。其中“.action”可以加也可以不加。
@Controller
public class ItesmHandler3{
	
	//建议url与方法名一致  方便维护
	@RequestMapping("/selectItems.action")
	private ModelAndView findItemsAll(){
		System.out.println("进入ItesmHandler3");
		List<Item> list = new ArrayList<Item>();
		list.add(new Item(1, "夏明1", 99.99, new Date(), "哈哈"));
		list.add(new Item(2, "夏明2", 99.99, new Date(), "哈哈"));
		list.add(new Item(3, "夏明3", 99.99, new Date(), "哈哈"));
		//创建ModelAndView,用来存放数据和视图
		ModelAndView mv = new ModelAndView();
		//添加数据到模型
		mv.addObject("itemList",list);
		//添加视图
		mv.setViewName("/WEB-INF/jsp/itemList.jsp");
		//返回一个模型
		//默认转发
		return mv;
	}
	
	//http://localhost:8080/springMVC-01/selectItems.action
	

}
