package com.xmn.utils;

import java.util.List;

public class Page<T> {
    
	private int total;//总条数
	private int page;//当前第几页
	private int size;//每页的条数
    private List<T> rows;//每页显示的集合


	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
    
	
    
}
