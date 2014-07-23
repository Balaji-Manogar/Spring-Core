package org.baali.spring.tests;

import java.applet.AppletContext;

import org.baali.spring.greeting.interfaces.Greeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringManualTesting
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		Greeting sayHelloSetter = (Greeting)context.getBean("greetingSetterInjection");
		sayHelloSetter.sayGreeting();
		Greeting sayHelloConstructor = (Greeting) context.getBean("greetingConstructorInjection");
		sayHelloConstructor.sayGreeting();
	}

}
