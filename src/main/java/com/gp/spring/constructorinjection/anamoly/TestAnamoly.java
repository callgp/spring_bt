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

package com.gp.spring.constructorinjection.anamoly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gp.springcore.annotations.Patient;

public class TestAnamoly {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gp/spring/constructorinjection/anamoly/config.xml");
		//System.out.println("printing");
		Addition ad = (Addition) ctx.getBean("add");
		System.out.println("addition constructor called is: " + ad);
		//System.out.println("Employee details: " + em.getName());
		//test ingg
//756pm
		
	/*	AbstractApplicationContext ctx2 = new ClassPathXmlApplicationContext("com/gp/springcore/interfaces/pschemaconfig.xml");
		Employee em1 = (Employee) ctx2.getBean("emp2");
		System.out.println("emp details: " + em1);*/
		
	/*	ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("com/gp/spring/springcore/pschemaconfig.xml");
		Employee empl2 = (Employee) ctx2.getBean("emp2");
		System.out.println("Employee ID: " + empl2.getId());
		System.out.println("Employee Name: " + empl2	.getName());*/
	}

}
