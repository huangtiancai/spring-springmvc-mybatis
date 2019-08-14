/**
 * 
 */
package com.htc.exception;

/**  
* @ClassName MyException
* @Description:自定义异常类
* @author htc  
* @date 2019年8月14日下午2:06:23 
*/
public class MyException extends Exception{
	//异常信息
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MyException(String message) {
		super();
		this.message = message;
	}
	
	
	
}
