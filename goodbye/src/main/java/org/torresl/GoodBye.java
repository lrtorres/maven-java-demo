package org.torresl;

/**
 * Hello world!
 *
 */
public class GoodBye
{
    private int x;

    public void GoodBye()
    {
	x=1;
	System.out.println( "Creating instance of GoodBye...");
    }

    public void GoodBye(int number)
    {
	x=number;
	System.out.println( "Creating instance of GoodBye with alternate constructor...");
    }

    public void sayGoodBye( )
    {
        System.out.println( "I said Goodbye World to " + x + " people");
    }
}
