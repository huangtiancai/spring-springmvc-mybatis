/**
 * 
 */
package com.htc.dao;

import com.htc.bean.User;

/**  
* @ClassName:UserDao
* @Description:
* @author:htc  
* @date:2019年7月29日 下午9:54:25
*/
public interface UserDao {
	//修改
	void updateUser(String name,String id);
	//根据id查
	User getUserById(String id);
}
