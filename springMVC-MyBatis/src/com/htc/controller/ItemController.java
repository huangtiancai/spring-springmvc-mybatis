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
	
	//参数绑定
	
	//需要从请求的参数中把请求的id取出来。
	//id包含在Request对象中。可以从Request对象中取id
	
	//想获得Request对象只需要在Controller方法的形参中添加一个参数即可。Springmvc框架会自动把Request对象传递给方法。
	
	//1.默认支持的参数类型:
	//HttpServletRequest request
	//HttpServletResponse response
	//HttpSession session

	//根据商品id查询商品
	@RequestMapping("/itemEdit")
	public ModelAndView queryItemById(HttpServletRequest request){
		System.out.println("进入queryItemById");
		
		//从request中获取请求参数
		String strId = request.getParameter("id");
		Integer id = Integer.valueOf(strId);
		
		//根据id查询商品数据
		Item item = itemService.queryItemById(id);
		
		//创建ModelAndView,用来存放数据和视图
		ModelAndView mv = new ModelAndView();
		//把商品数据放在模型中
		mv.addObject("item",item);
		//添加视图
		mv.setViewName("editItem");
		
		return mv;	
	}
	
	//Model/ModelMap
	//Model
	//1)除了ModelAndView以外，还可以使用Model来向页面传递数据，Model是一个接口，在参数里直接声明model即可
	//2)如果使用Model则可以不使用ModelAndView对象，Model对象可以向页面传递数据，View对象则可以使用String返回值替代。
	//3)不管是Model还是ModelAndView，其本质都是使用Request对象向jsp传递数据。
	
	//根据id查询商品,使用Model
//	@RequestMapping("/itemEdit")
//	public String queryItemById2(HttpServletRequest request,Model model){
//		System.out.println("进入queryItemById2");
//		
//		//从request中获取请求参数
//		String strId = request.getParameter("id");
//		Integer id = Integer.valueOf(strId);
//		
//		//根据id查询商品数据
//		Item item = itemService.queryItemById(id);
//
//		//把商品数据放在模型中
//		model.addAttribute("item", item);
//
//		return "editItem";	
//	}
	
	//ModelMap
	//1)ModelMap是Model接口的实现类，也可以通过ModelMap向页面传递数据
	//2)使用Model和ModelMap的效果一样，如果直接使用Model，springmvc会实例化ModelMap
	
	//根据id查询商品,使用Model
//	@RequestMapping("/itemEdit")
//	public String queryItemById3(HttpServletRequest request,ModelMap modelMap){
//		System.out.println("进入queryItemById3");
//		
//		//从request中获取请求参数
//		String strId = request.getParameter("id");
//		Integer id = Integer.valueOf(strId);
//		
//		//根据id查询商品数据
//		Item item = itemService.queryItemById(id);
//
//		//把商品数据放在模型中
//		modelMap.addAttribute("item", item);
//
//		return "editItem";	
//	}
	
	
	//2.绑定简单类型
	//当请求的参数名称和处理器形参名称一致时会将请求参数与形参进行绑定,这样，从Request取参数的方法就可以进一步简化
	//支持的数据类型
	//	参数类型推荐使用包装数据类型，因为基础数据类型不可以为null
	//	整形：Integer、int
	//	字符串：String
	//	单精度：Float、float
	//	双精度：Double、double
	//	布尔型：Boolean、boolean
	
	//说明：对于布尔类型的参数，请求的参数值为true或false。或者1或0
	//请求url:http://localhost:8080/xxx.action?id=2&status=false
	//处理器方法：
	//public String editItem(Model model,Integer id,Boolean status)

	/**
	 * @describe 根据id查询商品,绑定简单数据类型
	 * @author ks0pc23-PC 
	 * @date 2019年8月13日 下午2:12:48
	 * @param id
	 * @param modelMap
	 * @return
	 * @return String
	 * @throws Exception
	 */
//	@RequestMapping("/itemEdit")
//	public String queryItemById4(int id,ModelMap modelMap){
//		System.out.println("进入queryItemById4");
//		//根据id查询商品数据
//		Item item = itemService.queryItemById(id);
//		//把商品数据放在模型中
//		modelMap.addAttribute("item", item);
//		return "editItem";	
//	}
	
	//@RequestParam:使用@RequestParam常用于处理简单类型的绑定
	//1)value：参数名字，即入参的请求参数名字，如value="itemId"表示请求的参数区中的名字为itemId的参数的值将传入
	//2)required:是否必须，默认是true，表示请求中一定要有相应的参数，否则将报错
	//3)defaultValue：默认值，表示如果请求中没有同名参数时的默认值
	
//	@RequestMapping("/itemEdit")
//	public String queryItemById5(@RequestParam(value = "itemId",required = true,defaultValue = "1")Integer id ,ModelMap modelMap){
//		System.out.println("进入queryItemById5");
//		//根据id查询商品数据
//		Item item = itemService.queryItemById(id);
//		//把商品数据放在模型中
//		modelMap.addAttribute("item", item);
//		return "editItem";	
//	}
	
	//如下：参数可以为id，也可以为itemId
	//http://localhost:8080/springMVC-MyBatis/itemEdit.action?id=1
	//http://localhost:8080/springMVC-MyBatis/itemEdit.action?itemId=1
	
	
	//3.绑定pojo
	//需求:将页面修改后的商品信息保存到数据库中
	
	//使用pojo接收表单数据
	//如果提交的参数很多，或者提交的表单中的内容很多的时候,可以使用简单类型接受数据,也可以使用pojo接收数据。
	//要求：pojo对象中的属性名和表单中input的name属性一致
	
	//请求的参数名称和pojo的属性名称一致，会自动将请求参数赋值给pojo的属性
	
	/**
	 * @describe 更新商品,绑定pojo类型
	 * @author ks0pc23-PC 
	 * @date 2019年8月13日 下午3:41:54
	 * @return
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping("/updateItem")
	public String updateItem(Item item){
		System.out.println("进入updateItem");
		//根据id查询商品数据
		itemService.updateItemById(item);
		//返回逻辑视图
		return "success";	
	}
	
	//注意：
	//提交的表单中不要有日期类型的数据，否则会报400错误。如果想提交日期类型的数据需要用到后面的自定义参数绑定的内容。
	
	
	//4.绑定包装pojo
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
	@RequestMapping("/queryItem")
	public String queryItem(QueryVO queryvo){
		System.out.println("进入queryItem");
		
		System.out.println(queryvo.getItem().getId());
		System.out.println(queryvo.getItem().getName());
		
		//返回逻辑视图
		return "editItem";	
	}
	
	
	//5.自定义参数绑定
	//需求:在商品修改页面可以修改商品的生产日期，并且根据业务需求自定义日期格式
	//需求分析：由于日期数据有很多种格式，springmvc没办法把字符串转换成日期类型。所以需要自定义参数绑定。
	
	//前端控制器接收到请求后，找到注解形式的处理器适配器，对RequestMapping标记的方法进行适配，并对方法中的形参进行参数绑定。
	//可以在springmvc处理器适配器上自定义转换器Converter进行参数绑定
	
	
	
	
	
}
