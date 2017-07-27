package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		/*Resource res = new ClassPathResource("AppContext.xml");
		
		BeanFactory fac = new XmlBeanFactory(res);*/
		ApplicationContext fac = new ClassPathXmlApplicationContext("AppContext.xml");
		
		//Student st = (Student) fac.getBean("studentbean");
		//st.display();
		Employee em = (Employee) fac.getBean("emp");
		em.display();
	}
}
