package com.app.usuarios.entity;

import javax.persistence.*;

//import org.springframework.data.annotation.Id;

@Entity(name = "Users")
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Age")
	private Integer age;

	@Column(name = "Email")
	private String email;

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
