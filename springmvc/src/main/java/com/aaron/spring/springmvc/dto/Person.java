package com.aaron.spring.springmvc.dto;

public class Person {
	private int id;
	private String name;
	private String hobby;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", hobby=" + hobby + "]";
	}
	
}
