package com.erp.admin.util;

import java.io.Serializable;

public class PageUtil implements Serializable {

	private static final long serialVersionUID = -6368905370813530519L;

	// 分页开始
	private Integer pageStart;

	// 分页结束
	private Integer pageEnd;

	public Integer getPageStart() {
		return pageStart;
	}

	public void setPageStart(Integer pageStart) {
		this.pageStart = pageStart;
	}

	public Integer getPageEnd() {
		return pageEnd;
	}

	public void setPageEnd(Integer pageEnd) {
		this.pageEnd = pageEnd;
	}

}
