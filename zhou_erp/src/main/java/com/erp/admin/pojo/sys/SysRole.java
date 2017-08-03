package com.erp.admin.pojo.sys;

import java.io.Serializable;
import java.util.Date;

public class SysRole implements Serializable {

	private static final long serialVersionUID = -6803031866701607261L;

	private Long id;

	private String name;

	private String remark;

	private Date createDate;

	private Integer available;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getAvailable() {
		return available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}

}
