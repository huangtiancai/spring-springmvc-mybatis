/**
 * 
 */
package com.htc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.htc.dao.UserDao;

/**  
* @ClassName:UserService
* @Description:
* @author:htc  
* @date:2019年7月29日 下午10:05:25
*/
public class UserService {
	//普通属性
	
	//集合属性的注入
	private List<String> list;
	private Set<String> set;
	private Map<String, String> map;
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}


	
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	//UserService要依赖ud属性
	//对象属性
	private UserDao ud = null;

	public UserDao getUd() {
		return ud;
	}

	public void setUd(UserDao ud) {
		this.ud = ud;
	}

	//无参构造(实例化us)
//	public UserService(){
//		System.out.println("无参构造实例化us---初始化");
//	}
	
	//业务方法
	public void saveUserService(){
		//saveUser(): void-UserDao;
		//调用的是接口的方法
		ud.saveUser();
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
		
	//init-method="init" destroy-method="destroy"
	//在类中创建两个对应的方法
	//初始化方法
	public void init(){
		System.out.println("Bean被初始化");
	}
	//销毁方法
	public void destroy(){
		System.out.println("Bean被销毁");
	}

}
