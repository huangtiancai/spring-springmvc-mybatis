/**
 * 
 */
package com.htc.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.htc.dao.UserDao;

/**  
* @ClassName:UserService
* @Description:
* @author:htc  
* @date:2019年7月29日 下午10:05:25
*/
public class UserService {
	//普通属性
	private String name;
	private int age;

	//可以不提供get方法
	public String getName() {
		return name;
	}
	@Value(value="小红")
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	@Value(value="18")
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//UserService要依赖ud属性
	//对象属性(注入属性时用注解)	
	@Resource(name="ud1")
	private UserDao ud = null;
	
	public UserDao getUd() {
		return ud;
	}
	
	//对象属性
	public void setUd(UserDao ud) {
		this.ud = ud;
	}

	//无参构造(实例化us)
	public UserService(){
		System.out.println("无参构造实例化us---初始化");
	}
	
	//业务方法
	public void saveUserService(){
		//saveUser(): void-UserDao;
		//调用的是接口的方法
		ud.saveUser();
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}

}
