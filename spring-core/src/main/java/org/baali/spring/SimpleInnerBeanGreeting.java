package org.baali.spring;

import org.baali.spring.greeting.interfaces.Greeting;
import org.baali.spring.greeting.interfaces.InnerBeanGreeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleInnerBeanGreeting implements InnerBeanGreeting
{
	Greeting g;
	public Greeting getG()
	{
		return g;
	}
	public void setG(Greeting g)
	{
		this.g = g;
	}
	public void sayHello()
	{
		
		g.sayGreeting();		
	}

}
