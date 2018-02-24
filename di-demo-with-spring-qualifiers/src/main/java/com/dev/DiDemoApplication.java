package com.dev;

import com.dev.controllers.ConstructorInjectedController;
import com.dev.controllers.MyController;
import com.dev.controllers.PropertyInjectedController;
import com.dev.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		myController.hello();

		//System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());

		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());

		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
