/**
 * 
 */
package com.htc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htc.service.UserService;

/**  
* @ClassName:SpringTest
* @Description:
* @author:htc  
* @date:2019年7月29日 下午10:06:23
*/
public class SpringTest {
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext读取 applicationContext.xml 接口
		ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//根据id的值  获取对应的Bean实例
		UserService us = (UserService) application.getBean("us");
		//调用方法
		us.saveUserService();
		
		//只有singleton时才有close方法(ClassPathXmlApplicationContext)
		//application.close();
	}
}
