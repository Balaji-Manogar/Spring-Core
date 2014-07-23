package org.baali.spring;

import org.baali.spring.greeting.interfaces.Greeting;

public class SpringHelloWorldSetterInjection implements Greeting
{
	private String message;

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public void sayGreeting()
	{
		System.out.println(this.message);
		
	}

}
