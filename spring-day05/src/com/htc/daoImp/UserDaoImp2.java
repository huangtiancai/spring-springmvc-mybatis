/**
 * 
 */
package com.htc.daoImp;

import org.springframework.stereotype.Repository;

import com.htc.dao.UserDao;

/**  
* @ClassName:UserDaoImpl1
* @Description:
* @author:htc  
* @date:2019年7月29日 下午9:55:59
*/
public class UserDaoImp2 implements UserDao {	
	@Override
	public void saveUser() {
		System.out.println("增加成功2");
	}

}
