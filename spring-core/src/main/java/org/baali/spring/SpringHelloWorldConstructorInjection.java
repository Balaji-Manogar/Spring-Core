package org.baali.spring;

import org.baali.spring.greeting.interfaces.Greeting;

public class SpringHelloWorldConstructorInjection implements Greeting
{
	private String message;
	
	public SpringHelloWorldConstructorInjection(String msg)
	{
		this.message = msg;
	}

	public void sayGreeting()
	{
		System.out.println("Constructor injection: " + this.message);
		
	}

}
