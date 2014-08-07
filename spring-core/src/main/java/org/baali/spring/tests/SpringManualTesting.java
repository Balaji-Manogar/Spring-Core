package org.baali.spring.tests;

import java.applet.AppletContext;

import org.baali.spring.SimpleSpringList;
import org.baali.spring.greeting.interfaces.Greeting;
import org.baali.spring.greeting.interfaces.InnerBeanGreeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SimpleAliasRegistry;

public class SpringManualTesting
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		Greeting sayHelloSetter = (Greeting)context.getBean("greetingSetterInjection");
		sayHelloSetter.sayGreeting();
		Greeting sayHelloConstructor = (Greeting) context.getBean("greetingConstructorInjection");
		sayHelloConstructor.sayGreeting();
		Greeting sayReferenceSetter = (Greeting)context.getBean("greetingReferenceSetterInjection");
		sayReferenceSetter.sayGreeting();
		Greeting sayReferenceConstructor = (Greeting)context.getBean("greetingConstructorReferenceInjection");
		sayReferenceConstructor.sayGreeting();
		InnerBeanGreeting innerBeanSetterInjection = (InnerBeanGreeting)context.getBean("innerBeanSetterInjection");
		innerBeanSetterInjection.sayHello();
		SimpleSpringList listInjection = (SimpleSpringList)context.getBean("simpleListInjection");
		listInjection.printMessages();
	}

}
