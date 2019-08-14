/**
 * 
 */
package com.htc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.htc.exception.MyException;
import com.htc.pojo.Item;
import com.htc.service.ItemService;
/**  
* @ClassName:ItemController
* @Description:
* @author:htc  
* @date:2019年8月12日 下午11:48:02
*/
@Controller
//@RequestMapping("item")
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	
	//绑定包装pojo
	//需求：使用包装的pojo接收商品信息的查询条件
	
	/**
	 * 
	 * @describe 查询商品，绑定包装数据类型
	 * @author ks0pc23-PC 
	 * @date 2019年8月13日 下午4:09:26
	 * @param queryvo
	 * @return
	 * @return String
	 * @throws Exception
	 */
//	@RequestMapping("/queryItem")
//	public String queryItem(QueryVO queryvo){
//		System.out.println("进入queryItem");
//		
//		System.out.println(queryvo.getItem().getId());
//		System.out.println(queryvo.getItem().getName());
//		
//		//返回逻辑视图
//		return "editItem";	
//	}
	
	
	//1.高级参数绑定
	//1)数组类型的参数绑定
	//2)List类型的绑定
	
	/**
	 * @describe 包装类型 绑定 数组类型，可以使用两种方式，pojo的属性接收，和直接接收
	 * @author ks0pc23-PC 
	 * @date 2019年8月13日 下午4:09:26
	 * @param queryvo
	 * @return
	 * @return String
	 * @throws Exception
	 */
//	@RequestMapping("/queryItem")
//	public String queryItem(QueryVO queryvo,Integer[] ids){
//		System.out.println("进入queryItem");
//		
//		System.out.println(queryvo);
//		System.out.println(queryvo.getItem().getId());
//		System.out.println(queryvo.getItem().getName());
//		
//		System.out.println(queryvo.getIds());
//		System.out.println(queryvo.getIds().length);
//		
//		System.out.println(ids);
//		System.out.println(ids.length);
//		
//		//返回逻辑视图
//		return "success";	
//	}
	
	
	//2.@RequestMapping注解的使用
	//1)@RequestMapping("/itemList.action")
	
	//2)@RequestMapping("/itemList")
	
	//3)@RequestMapping设置多个url请求
	//  @RequestMapping(value={"itemList","itemListAll"})

	//4)@RequestMapping注解加在类上的含义
	
	//5)@RequestMapping中设置请求方法-请求方法限定

	/**
	 * @describe 显示商品列表-@RequestMapping注解一般使用
	 * @author ks0pc23-PC 
	 * @date 2019年8月13日 下午2:11:40
	 * @return
	 * @return ModelAndView
	 * @throws Exception
	 */
//	@RequestMapping("/itemList.action")
//	public ModelAndView queryItemList(){
//		System.out.println("进入queryItemList");
//		
//		//获取商品数据
//		List<Item> list = itemService.queryItemList();
//		
//		//创建ModelAndView,用来存放数据和视图
//		ModelAndView mv = new ModelAndView();
//		//添加数据到模型
//		mv.addObject("itemList",list);
//		//添加视图
//		mv.setViewName("itemList");
//		
//		return mv;	
//	}
	//http://localhost:8080/springMVC-MyBatis/itemList.action	
	//http://localhost:8080/springMVC-MyBatis/itemEdit.action?id=1

	
	
	//@RequestMapping
	//@RequestMapping注解可以定义不同的处理器映射规则:
	//URL路径映射：
	//@RequestMapping("/itemList")或@RequestMapping(value="itemList")
	
	//注意：value的值是数组(一个或者多个)，可以将多个url映射到同一个方法
	
	/**
	 * @describe 查询商品列表-@RequestMapping设置多个url请求
	 * @author ks0pc23-PC 
	 * @date 2019年8月14日 上午9:27:35
	 * @param queryvo
	 * @param ids
	 * @return
	 * @return String
	 * @throws Exception
	 */
//	@RequestMapping(value={"itemList","itemListAll"})
//	public ModelAndView queryItemList1(){
//		System.out.println("进入queryItemList1");
//		
//		//获取商品数据
//		List<Item> list = itemService.queryItemList();
//		
//		//创建ModelAndView,用来存放数据和视图
//		ModelAndView mv = new ModelAndView();
//		//添加数据到模型
//		mv.addObject("itemList",list);
//		//添加视图
//		mv.setViewName("itemList");
//		
//		return mv;	
//	}
	//http://localhost:8080/springMVC-MyBatis2/itemList.action
	//http://localhost:8080/springMVC-MyBatis2/itemListAll.action
	
	
	/**
	 * @describe 查询商品列表-@RequestMapping注解加在类上
	 * 			 在class上添加@RequestMapping(url)指定通用请求前缀， 限制此类下的所有方法请求url必须以请求前缀开头
	 *			如：@RequestMapping("item") 
	 *			此时需要进入queryItemList()方法的请求url为：
	 *			http://localhost:8080/springMVC-MyBatis2/item/itemList.action
	 *			http://localhost:8080/springMVC-MyBatis2/item/itemListAll.action
	 * @author ks0pc23-PC 
	 * @date 2019年8月14日 上午10:04:14
	 * @return
	 * @return ModelAndView
	 * @throws MyException 
	 * @throws Exception
	 */
//	@RequestMapping(value={"itemList","itemListAll"})
//	public ModelAndView queryItemList2(){
//		System.out.println("进入queryItemList2");
//		
//		//获取商品数据
//		List<Item> list = itemService.queryItemList();
//		
//		//创建ModelAndView,用来存放数据和视图
//		ModelAndView mv = new ModelAndView();
//		//添加数据到模型
//		mv.addObject("itemList",list);
//		//添加视图
//		mv.setViewName("itemList");
//		
//		return mv;	
//	}
	
	
	//请求方法限定
	//除了可以对url进行设置，还可以限定请求进来的方法
	
	//1)限定GET方法
	//如果通过POST访问则报错：
	//HTTP Status 405 - Request method 'POST' not supported
	//@RequestMapping(method = RequestMethod.GET)
	
	//2)限定POST方法
	//如果通过GET访问则报错：HTTP Status 405 - Request method 'GET' not supported
	//@RequestMapping(method = RequestMethod.POST)
	
	//3)GET和POST都可以
	//@RequestMapping(method = {RequestMethod.GET,RequestMethod.POST})
	
	//这个例子是以限定GET方法为例
	@RequestMapping(value = "itemList",method = RequestMethod.GET)
	public ModelAndView queryItemList3() throws MyException{
		System.out.println("进入queryItemList3");
		
		
		//修改ItemController方法“queryItemList”，抛出异常
//		System.out.println("进入queryItemList-自定义异常");
		//自定义异常
//		if(true){
//			throw new MyException("自定义异常出现了");
//		}
		// 运行时异常
//		int a = 1 / 0;
		
		
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
	
	
	//3.Controller类的方法返回值
	//  a)返回ModelAndView
	//	b)方法返回void的3种方式
	//	c)方法返回字符串的3种方式	
	
	//a)返回ModelAndView
	//如上述Controller类的方法中定义ModelAndView对象并返回，对象中可添加model数据、指定view
	
	
	//b)返回void
	//在Controller方法形参上可以定义request和response，使用request或response指定响应结果:
	
	//1)使用request转发页面，如下：
	//request.getRequestDispatcher("页面路径").forward(request, response);
	//request.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(request, response);
	
	//2)以通过response页面重定向：
	//response.sendRedirect("url")
	//response.sendRedirect("/springmvc_d02_c02/itemEdit.action");
	
	//3)可以通过response指定响应结果，例如响应json数据如下：
	//response.getWriter().print("{\"abc\":123}");
	
	
	
	
//	@RequestMapping("/itemEdit")
//	public String queryItemById(HttpServletRequest request){
//		System.out.println("进入queryItemById");
//		return "success2";
//	}
	
	@RequestMapping("/itemEdit")
	public String queryItemById(int id,ModelMap modelMap){
		System.out.println("进入queryItemById");
		//根据id查询商品数据
		Item item = itemService.queryItemById(id);
		//把商品数据放在模型中
		modelMap.addAttribute("item", item);
		return "editItem";	
	}
	
	/**	
	 * @describe 描述
	 * @author ks0pc23-PC 
	 * @date 2019年8月14日 上午11:03:20
	 * @param queryvo
	 * @return
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping("/queryItem")
	public void queryItem(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("进入queryItem");
		//1.使用request进行转发
//		request.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(request, response);
//		//2.使用response进行转发
//		response.sendRedirect("/springMVC-MyBatis2/itemEdit.action");
		
		//3.使用response直接显示
		
		//1)返回json-手动写:
		//第一步是拼接需要的json数据
		//第二步是用servlet的内置对象response返回到前台
		
		//模拟的json数据：{"success":true,"msg":"修改失败！"},（注意：双引号内使用双引号必须在里面的双引号前加转义字符"\"）
		String json = "{\"success\":true,\"msg\":\"修改成功\"}";
		
		//通过response设置响应体
		//设置响应的编码方式
		response.setContentType("text/html;charset=UTF-8");//避免返回前台的json显示乱码
		
		response.getWriter().write(json);
		
		//2)用Spring框架
	}
	
	
	//b)返回字符串
	
	//1)逻辑视图名
	//controller方法返回字符串可以指定逻辑视图名，通过视图解析器解析为物理视图地址。
	// 返回逻辑视图:
	// return "itemList";	
	// 指定逻辑视图名，经过视图解析器解析为jsp物理路径:
	// /WEB-INF/jsp/itemList.jsp
	
	//2)Redirect
	//Contrller方法返回字符串可以重定向到一个url地址,如下商品修改提交后重定向到商品编辑页面。
//	@RequestMapping("/updateItem")
//	public String updateItem(Item item){
//		System.out.println("进入updateItem");
//		//根据id查询商品数据
//		itemService.updateItemById(item);
//		
//		//查询列表itemList
//		//进入编辑页面itemEdit
//		//修改商品成功后，重定向到商品编辑页面itemEdit
//		System.out.println("当前产品的id:"+item.getId());
//		
//		// 重定向后浏览器地址栏变更为重定向的地址，
//		// 重定向相当于执行了新的request和response，所以之前的请求参数都会丢失
//		// 如果要指定请求参数，需要在重定向的url后面添加 ?itemId=1 这样的请求参数
//		
//		return "redirect:/itemEdit.action?id="+item.getId();	
//	}
	
	//3)forward转发
	//Controller方法执行后继续执行另一个Controller方法,如下商品修改提交后转向到商品修改页面，修改商品的id参数可以带到商品修改方法中。
	//转发id参数不会丢失，无需使用item.getId()获取拼接到url地址后

	@RequestMapping("/updateItem")
	public String updateItem2(Item item){
		System.out.println("进入updateItem");
		//根据id查询商品数据
		itemService.updateItemById(item);
		
		//查询列表itemList
		//进入编辑页面itemEdit
		//修改商品成功后转发到商品编辑页面itemEdit，转发后浏览器地址栏还是原来的请求地址
		//转发并没有执行新的request和response，所以之前的请求参数(请求参数还在request中)都存在
		
		return "forward:/itemEdit.action";	
	}
	
	
	//异常处理器
	
	//图片上传
	
	
	
	
	
	//json数据交互
	
	//1.@RequestBody
	//作用:@RequestBody注解用于读取http请求的内容(字符串)，通过springmvc提供的HttpMessageConverter接口将读到的内容（json数据）转换为java对象并绑定到Controller方法的参数上。
	
//	传统的请求参数：
//	itemEdit.action?id=1&name=zhangsan&age=12
//	现在的请求参数：
//	使用POST请求，在请求体里面加入json数据

//	本例子应用：
//	@RequestBody注解实现接收http请求的json数据，将json数据转换为java对象进行绑定

	//2.@ResponseBody
	//作用:@ResponseBody注解用于将Controller的方法返回的对象，通过springmvc提供的HttpMessageConverter接口转换为指定格式的数据如：json,xml等，通过Response响应给客户端
	
//	本例子应用：
//	@ResponseBody注解实现将Controller方法返回java对象转换为json响应给客户端

	//3.请求json，响应json实现
	//如果需要springMVC支持json，必须加入json的处理jar-Jackson
	
	//特别注意：@ResponseBody的两种用法
	//第一种用法,方法头部
		//@ResponseBody
		//public Item tetsJson(@RequestBody Item item){}
		
	//第二种，方法修饰符后:
		//public @ResponseBody Item tetsJson(@RequestBody Item item){}
	
	/**
	 * @describe 测试json的交互
	 * @author ks0pc23-PC 
	 * @date 2019年8月14日 下午3:59:53
	 * @param item
	 * @return
	 * @return Item
	 * @throws Exception
	 */
	@RequestMapping(value = "testJson")
	@ResponseBody 
	public Item tetsJson(@RequestBody Item item){
		System.out.println("进入testJson");
		System.out.println(item);
		return item;//@ResponseBody注解实现将Controller方法返回java对象转换为json响应给客户端
	}
	
	
	//RESTful支持
	//需求:RESTful方式实现商品信息查询，返回json数据
	
	//使用RESTful风格开发的接口，根据id查询商品，接口地址是：http://localhost:8080/springMVC-MyBatis2/item/1.action
	//url会被过滤:/item/1.action--->/item/1
	
	
	//我们需要从url上获取商品id，步骤如下:
//	1. 使用注解@RequestMapping("item/{id}")声明请求的url   {xxx}叫做占位符，请求的URL可以是“item /1”或“item/2”
//	2. 使用(@PathVariable() Integer id)获取url上的数据
	
	
	@RequestMapping("item/{id}")
	@ResponseBody 
	public Item queryItemByIds(@PathVariable() Integer id){
		System.out.println("进入RESTful方式实现商品信息查询方法");
		
		Item item = itemService.queryItemById(id);

		return item;
	}
	
	//注意:
	//1.如果@RequestMapping中表示为"item/{id}"，id和形参名称一致，@PathVariable不用指定名称。
	//2.如果不一致，例如"item/{ItemId}"则需要指定名称@PathVariable("itemId")
	

	//http://localhost:8080/springMVC-MyBatis2/item.action?id=1
	//http://localhost:8080/springMVC-MyBatis2/item/1.action

	//3.注意@PathVariable()和@RequestParam的区别:
	    //@PathVariable()是获取url上数据的(获取的是"/item/1.action"中的"1")               
		//@RequestParam获取请求参数的（包括post表单提交）获取的是"item.action?id=1"的id
	
	//4.如果加上@ResponseBody注解，就不会走视图解析器，不会返回页面，目前返回的json数据。如果不加，就走视图解析器，返回页面

	

	//拦截器
	
	
	
	
}
