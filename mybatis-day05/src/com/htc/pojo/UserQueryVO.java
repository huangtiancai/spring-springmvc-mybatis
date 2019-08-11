/**
 * 
 */
package com.htc.pojo;

/**  
* @ClassName UserQueryVO
* @Description:包装类
* @author htc  
* @date 2019年8月10日上午10:13:53 
*/
public class UserQueryVO {
	private User user;
	private UserCustom userCustom;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserCustom getUserCustom() {
		return userCustom;
	}
	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
	
	
}
