package org.torresl;

/**
 * This is the "Hi" class package.
 *
 */
public class Hi 
{
	private int x=0;

	public void Hi()
	{
		x=1;
	}

	public void Hi(int number)
	{
		x=number;
	}

	public void spitItOut()
	{
	  System.out.println("Using my Hi class, value is " + x);
	}
}
