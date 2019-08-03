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
	
	//创建service层实例,为其注入dao层属性 
	private UserDao ud;
	

	public void setUd(UserDao ud) {
		this.ud = ud;
	}

	@Override
	public void delete(Integer id) {
		ud.delete(id);
	}
}
