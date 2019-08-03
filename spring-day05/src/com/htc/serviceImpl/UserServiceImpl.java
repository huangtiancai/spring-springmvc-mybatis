/**
 * 
 */
package com.htc.serviceImpl;

import javax.annotation.Resource;

import com.htc.dao.UserDao;
import com.htc.service.UserService;

/**  
* @ClassName:UserServiceImpl
* @Description:
* @author:htc  
* @date:2019年7月31日 上午12:06:20
*/
public class UserServiceImpl implements UserService {
	
	@Resource(name="ud1")
	private UserDao ud = null;
	
	public void setUd(UserDao ud) {
		this.ud = ud;
	}

	//业务方法-要被增强的
	@Override
	public int saveUserService(String name) {
		//写日志
		int i=1/0;
		System.out.println("name:"+name);
		ud.saveUser();
		return 1;
	}
}
