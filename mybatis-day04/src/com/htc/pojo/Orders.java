/**
 * 
 */
package com.htc.pojo;

import java.util.Date;
import java.util.List;

/**  
* @ClassName:Orders
* @Description:
* @author:htc  
* @date:2019年8月11日 下午3:09:06
*/
public class Orders {
	private Integer id;
	private Integer user_id;
	private String numbers;
	private Date createtitle;
	private String note;
	//用户对象
	private User user;
	//订单详情的集合
	private List<OrdersDetail> od;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getNumbers() {
		return numbers;
	}
	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}
	public Date getCreatetitle() {
		return createtitle;
	}
	public void setCreatetitle(Date createtitle) {
		this.createtitle = createtitle;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Orders(Integer id, Integer user_id, String numbers, Date createtitle, String note) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.numbers = numbers;
		this.createtitle = createtitle;
		this.note = note;
	}
	public Orders() {
		super();
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", user_id=" + user_id + ", numbers=" + numbers + ", createtitle=" + createtitle
				+ ", note=" + note + "]";
	}
	
}
