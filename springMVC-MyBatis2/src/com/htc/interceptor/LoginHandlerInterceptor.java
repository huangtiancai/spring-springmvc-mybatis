/**
 * 
 */
package com.htc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**  
* @ClassName:HandlerInterceptor1
* @Description:拦截器:实现HandlerInterceptor接口
* @author:htc  
* @date:2019年8月14日 下午10:50:56
*/
public class LoginHandlerInterceptor implements HandlerInterceptor{
	// controller执行后且视图返回后调用此方法
	// 这里可得到执行controller时的异常信息
	// 这里可记录操作日志
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("LoginHandlerInterceptor....afterCompletion");
	}

	// controller执行后但未返回视图前调用此方法
	// 这里可在返回用户前对模型数据进行加工处理，比如这里加入公用信息以便页面显示
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("LoginHandlerInterceptor....postHandle");		
	}
	
	// Controller执行前调用此方法
	// 返回true表示继续执行，返回false中止执行
	// 这里可以加入登录校验、权限拦截等
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		System.out.println("LoginHandlerInterceptor....preHandle");
		HttpSession session = request.getSession();
		Object username = session.getAttribute("username");
		if(username!=null){
			// 如果不为空则放行
			return true;
		}else{
			// 如果为空则跳转到登录页面
			response.sendRedirect(request.getContextPath()+"/user/toLogin.action");
		}
		
		return false;
	}
	
//	preHandle按拦截器定义顺序调用
//	postHandler按拦截器定义逆序调用
//	afterCompletion按拦截器定义逆序调用
//
//	postHandler在拦截器链内所有拦截器返成功调用
//	afterCompletion只有preHandle返回true才调用

	
	
	
}
