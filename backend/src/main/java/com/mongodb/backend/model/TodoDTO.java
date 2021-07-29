package com.mongodb.backend.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "todos")
public class TodoDTO {
	@Id
	private String id;
	
	@NotNull(message = "name cannot be null")
	private String name;
	
	@NotNull(message = "email cannot be null")
	private String email;
	
	@NotNull(message = "completed cannot be null")
	private String password;
	
	private Date createdAt;
	
	private Date updatedAt;
	public void setCreatedAt(Date date) {
		// TODO Auto-generated method stub
		
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
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setId(Date createdAt) {
		this.createdAt = createdAt;
	}
}
