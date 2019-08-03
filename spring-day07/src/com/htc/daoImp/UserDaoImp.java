/**
 * 
 */
package com.htc.daoImp;

import org.springframework.jdbc.core.JdbcTemplate;

import com.htc.bean.User;
import com.htc.dao.UserDao;

/**  
* @ClassName:UserDaoImpl
* @Description:
* @author:htc  
* @date:2019年7月29日 下午9:55:59
*/
public class UserDaoImp implements UserDao {
	//创建dao层实例，为其注入jdbc模板实例
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}


	@Override
	public void updateUser(String name, String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}


}
