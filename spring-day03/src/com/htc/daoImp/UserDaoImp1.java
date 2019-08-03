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
@Repository("ud1")
public class UserDaoImp1 implements UserDao {

	//无参构造
//	public UserDaoImp1(){
//		System.out.println("无参构造实例化ud1---初始化1");
//	}
	
	@Override
	public void saveUser() {
		System.out.println("增加成功1");
	}

}
