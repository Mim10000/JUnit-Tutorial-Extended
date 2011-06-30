package de.vogella.junit.first;

public class MyClass
{
	public int multiply(int x, int y) 
	{
		return x * y;
	}
	public int divide(int x, int y) 
	{
		int total;
		
		if(x==0 || y==0)
		{
			 throw new IllegalArgumentException("Cannot Divide By Zero");
		}
		else
		{
			total = x/y;
			return total;
		}
	}
}
