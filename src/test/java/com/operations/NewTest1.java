package com.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.testng.annotations.Test;

public class NewTest1 {
	@Test
	public void f() {
		String s[]={"Sam","Tom","Jerry"};
		ArrayList al=new ArrayList();
		al.add(Arrays.asList(s));

		Iterator it=al.iterator();
		while(it.hasNext())
		{

			String element=String.valueOf(it.next());
			System.out.print("Element"+element);
		}
	}
}