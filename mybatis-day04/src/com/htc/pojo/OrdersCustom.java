/**
 * 
 */
package com.htc.pojo;

/**  
* @ClassName:OrdersCustom
* @Description:订单扩展类
* @author:htc  
* @date:2019年8月11日 下午3:19:11
*/
public class OrdersCustom extends Orders{
	//扩展属性
	private String username;
	private String sex;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
