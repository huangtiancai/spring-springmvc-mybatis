/**
 * 
 */
package com.htc.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**  
* @ClassName CustomHandleException
* @Description:自定义异常处理器
* @author htc  
* @date 2019年8月14日下午2:08:59 
*/
public class CustomHandleException implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) {
		//定义异常信息
		String msg;
		//判断异常类型
		if(exception instanceof MyException){
			//如果是自定义异常，读取异常信息
			msg = exception.getMessage();
		}else{
			//如果是运行时异常，则取错误堆栈，从堆栈中获取异常信息
			Writer out = new StringWriter();
			PrintWriter s = new PrintWriter(out);
			exception.printStackTrace(s);
			
			msg = out.toString();
			
		}
		
		ModelAndView ModelAndView = new ModelAndView();
		ModelAndView.addObject("msg", msg);
		ModelAndView.setViewName("error");
		
		return ModelAndView;
	}
	
}
