/**
 * 
 */
package com.htc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
* @ClassName:UserContrller
* @Description:
* @author:htc  
* @date:2019年8月15日 上午12:08:15
*/
@Controller
@RequestMapping("user")
public class UserContrller {
	/**
	 * function: toLogin
	 * Description:跳转到登录页面
	 * return:String
	 */
	@RequestMapping("toLogin")
	public String toLogin(){
		System.out.println("进入toLogin方法！");
		return "login";
	}
	
	/**
	 * function: login
	 * Description:用户登录
	 * return:String
	 */
	@RequestMapping("login")
	public String login(String username,String password,HttpSession session){
		System.out.println("进入login方法！");

		//校验用户登录
		System.out.println(username);
		System.out.println(password);
		
		// 把用户名放到session中
		session.setAttribute("username", username);
		
		return "redirect:/item/itemList.action";
	}
	
}
