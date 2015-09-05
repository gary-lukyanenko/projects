package be.il2consulting.basicspringapp;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ac = new FileSystemXmlApplicationContext("src/main/java/be/il2consulting/beans/beanconfig.xml");
		
		Car car = (Car)ac.getBean("car");
		car.drive();
		
		System.out.println(car);
		
		ac.close();
		
	}

}
