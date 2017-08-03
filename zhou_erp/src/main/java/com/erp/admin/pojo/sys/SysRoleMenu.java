package com.erp.admin.pojo.sys;

import java.io.Serializable;
import java.util.Date;

public class SysRoleMenu implements Serializable{
	
	private static final long serialVersionUID = -6866541119932198011L;

	private Long id;
	
	private Long roleId;
	
	private Long menuId;
	
	private Date createDate;
	
	private Integer available;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
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
