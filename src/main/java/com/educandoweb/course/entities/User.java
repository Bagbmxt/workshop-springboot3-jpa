package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{
	
	/**
	 * 
	 */ 
	/**  ATRIBUTOS USUARIO */ 
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String email;
	private String password;
	private String phone;
	
	
	/**  CONSTRUTOR VAZIO*/ 
	public User() {
		
	}

	/**  CONSTRUTOR */ 
	public User(Long id, String name, String email, String password, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone =  phone;
	}

	
	/**  GETTERS E SETTERS */ 
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	/**  HASHCODE  'botao direito hashcode e equals aparece os 2'  */  
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	
	/**   EQUALS*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
