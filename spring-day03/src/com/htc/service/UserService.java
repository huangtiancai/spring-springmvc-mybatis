/**
 * 
 */
package com.htc.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.htc.dao.UserDao;

/**  
* @ClassName:UserService
* @Description:
* @author:htc  
* @date:2019年7月29日 下午10:05:25
*/
@Service("us")
public class UserService {
	//Bean属性的注入（普通属性）
	
	//普通属性
	//普通属性两种注入方法：1.放在set方法上；2.放在属性上，如private String name;上的@Value(value="小红")
	//对象属性同样注入有两种位置
	
	@Value(value="小红")
	private String name;
	private int age;

	//可以不提供get方法
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	//Bean属性的注入（普通属性）
	@Value(value="18")
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//UserService要依赖ud属性
	//对象属性
	
	//spring的注解装配Bean-引用注解去定义Bean
	
	//1.@Component  描述spring框架中的Bean  【@Component(“名”)  指定类的对象名 】
	
	//2.@Autowired:自动注入：先找名字/再找类型      示例：@Autowired
	//  单独使用@Autowired进行自动注入:注意如果有多个实例要屏蔽留下一个，如ud1和ud2只能留下一个注解，如选择ud2,
	//  则只留下@Component("ud2")，去掉@Component("ud1")这样才能完成属性的自动注入
	
	//3.@Resources：指定具体对象注入 @Resources(name="指定的对象实例")      示例：@Resource(name="ud1")
	//  这时的对于Dao实现类的标注@Component("ud2")和@Component("ud1")都保留
	//现在开发，指定名字注入对象实例
	
	
	//4.spring的框架提供了与@Component注解等效的三个注解
	//@Repository    对于Dao实现类的标注
	//@Service       对于Service 实现类的标注
	//@Controller    对于Controller实现类的标注

	//5.Bean其他属性的注解
	//配置bean初始化方法和销毁的方法
	//@PostConstruct   标注初始化方法
	//@PreDestroy  标注销毁方法

	
	
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
		
	//init-method="init" destroy-method="destroy"
	//在类中创建两个对应的方法
	//初始化方法
//	public void init(){
//		System.out.println("Bean被初始化");
//	}
//	//销毁方法
//	public void destroy(){
//		System.out.println("Bean被销毁");
//	}

}
