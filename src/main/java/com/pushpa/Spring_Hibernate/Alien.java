package com.pushpa.Spring_Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

private String name;
@Id
private int id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Alien(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
@Override
public String toString() {
	return "Alien [name=" + name + ", id=" + id + "]";
}
public Alien() {
	super();
	// TODO Auto-generated constructor stub
}


}
