package edu.berkeley.path;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class HelloWorldTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HelloWorldTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HelloWorldTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testHelloWorldInstance()
    {
	System.out.println("***!!!This test should purposely fail!!!***");
	Conversation tconv = new Conversation();
	assertTrue (tconv.getValue() == 1);
        /*assertTrue( true );*/
    }
}
