package com.gp.springcore.stereotype.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("instr")
@Scope("prototype")
public class Instructor {
	@Value("100")
	int id=200;//this wont print annotation has precedence
	@Value("gp")
	String name;
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
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + "]";
	}
	

}
