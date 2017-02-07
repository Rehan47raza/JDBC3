package com;
import java.io.Serializable;
public class Author implements Serializable {
	static final long serialVersionUID = 1L;
	private String authorName;
	private int count;
	public Author(){
		
	}
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}