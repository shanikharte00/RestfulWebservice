package com.sk.RestfulWebserviceProject;

public class Alien {
	private int id;
	private String name;
	private String points;
	
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
	public String getPoints() {
		return points;
	}
	public void setPoints(String points) {
		this.points = points;
	}
	public Alien(int id, String name, String points) {
		super();
		this.id = id;
		this.name = name;
		this.points = points;
	}
	public Alien() {
		super();
	}
	
	
}
