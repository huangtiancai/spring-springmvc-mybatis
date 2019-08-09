/**
 * 
 */
package com.htc.dao;

import com.htc.pojo.User;

/**  
* @ClassName UserDao
* @Description:
* @author htc  
* @date 2019年8月9日下午4:48:17 
*/
public interface UserDao {
	User findUserById(int id);
}
