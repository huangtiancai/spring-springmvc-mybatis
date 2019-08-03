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
	public UserService(){
		System.out.println("无参构造实例化us---初始化");
	}
	
	//业务方法
	public void saveUserService(){
		//saveUser(): void-UserDao;
		//调用的是接口的方法
		ud.saveUser();
	}


}
