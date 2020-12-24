/*package com.bt.spring.SpringCore;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com.bt.spring.SpringCore.config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee ID: " + emp.getId());
		System.out.println("Employee Name: " + emp.getName());

	}

}

*/

package com.gp.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPSchema {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/gp/spring/springcore/pschemaconfig.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee ID: " + emp.getId());
		System.out.println("Employee Name: " + emp.getName());
		//test ingg
//756pm
	}

}
