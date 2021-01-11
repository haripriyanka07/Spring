package com.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {
		
		//read config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LanguageConfig.class);

		//get bean from spring container
		Language lang = context.getBean("python", Language.class);
		
		//call a method
		lang.language();
		lang.exec();
		lang.printStatment();
		
		// close
		context.close();
	}

}
