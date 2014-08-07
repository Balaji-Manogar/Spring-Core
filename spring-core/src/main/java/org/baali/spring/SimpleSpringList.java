package org.baali.spring;

import java.util.Iterator;
import java.util.List;

import org.baali.spring.greeting.interfaces.BasicDataTypeSpringList;

public class SimpleSpringList implements BasicDataTypeSpringList
{
	private List<String> list;

	public List<String> getList()
	{
		return list;
	}

	public void setList(List<String> list)
	{
		this.list = list;
	}

	public void printMessages()
	{
		for (String s : list )
		{
			System.out.println(s);
		}		
	}

}
