package be.il2consulting.basicspringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {

	private static ApplicationContext ac;

	public static void main(String[] args) {

		ac = new FileSystemXmlApplicationContext("beanconfig.xml");
		
		Car car = (Car)ac.getBean("car");
		car.drive();
		
	}

}
