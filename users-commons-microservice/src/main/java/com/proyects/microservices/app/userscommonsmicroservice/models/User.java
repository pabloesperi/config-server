package com.proyects.microservices.app.userscommonsmicroservice.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "users")
public class User implements Serializable{

	private static final long serialVersionUID = 6920604792336801906L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "enabled")
	private boolean enabled;
	
	@Column(name = "userName", unique = true, length = 20)
	private String userName;
	
	@Column(name = "password", length = 60)
	private String password;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surName")
	private String surName;
	
	@Column(name = "email", unique = true, length = 100)
	private String email;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "users_to_roles", joinColumns = @JoinColumn(name="user_id"), 
	inverseJoinColumns = @JoinColumn(name="roles_id"), 
	uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "roles_id"})})
	private List <Role> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getName() {
		return userName;
	}

	public void setName(String name) {
		this.userName = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
