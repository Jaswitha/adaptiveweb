package com.rs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Store;



@Entity
@Indexed
@Table(name = "users", schema = "aw")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)  
	private String username;
	private String password;
	@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
	private String userid;
	
	public User(String username, String password, String userid) {
		this.username = username;
		this.password = password;
		this.userid = userid;
			}
	@Id
	@Column(name = "name")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="userId")
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}


}
