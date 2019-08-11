/**
 * 
 */
package com.htc.pojo;

import java.util.Date;

/**  
* @ClassName:Items
* @Description:
* @author:htc  
* @date:2019年8月11日 下午3:08:52
*/
public class Items {
	private Integer id;
	private String name;
	private Double price;
	private String detail;
	private Date createtime;
	private Integer type;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Items(Integer id, String name, Double price, String detail, Date createtime, Integer type) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.detail = detail;
		this.createtime = createtime;
		this.type = type;
	}
	public Items() {
		super();
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", detail=" + detail + ", createtime="
				+ createtime + ", type=" + type + "]";
	}
}
