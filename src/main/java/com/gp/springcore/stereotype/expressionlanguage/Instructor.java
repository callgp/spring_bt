package com.gp.springcore.stereotype.expressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("instr")
@Scope("prototype")
public class Instructor {
	//@Value("#{50+110}")
	//@Value("#{T(java.lang.Math).abs(-99)}")
	//@Value("#{new Integer(88)}")
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	int id=200;//this wont print annotation has precedence
	
	//@Value("gp")
	@Value("#{'gpppp'.toUpperCase()}")
	String name;
	
	//@Value("#{2+4>5}")
	@Value("#{2+4>8?true:false}")
	private boolean active;
	
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
		return "Instructor [id=" + id + ", name=" + name + ", active=" + active + "]";
	}
	
	

}
