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

package com.gp.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gp.spring.springcore.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gp/springcore/properties/propertiesconfig.xml");
		CountryLanguages cntylang = (CountryLanguages) ctx.getBean("counntrylang");
		System.out.println("cntylang details: " + cntylang);
		//System.out.println("model ID: " + dealr.getModel());
		//System.out.println("set class ID: " + dealr.getModel().getClass());
		//test ingg
//756pm
	}

}
