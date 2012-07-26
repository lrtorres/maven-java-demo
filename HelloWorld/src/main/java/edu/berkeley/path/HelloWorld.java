package edu.berkeley.path;

import org.torresl.*;

/**
 * Hello world!
 *
 */
public class HelloWorld
{
    public static void main( String[] args )
    {
	Hi helloworld = new Hi();
	Hi somehello1 = new Hi();
	Hi somehello2 = new Hi();

	GoodBye byeworld = new GoodBye();
	GoodBye somebye2 = new GoodBye();
	GoodBye somebye3 = new GoodBye();

	somehello1.Hi(2);
	somebye3.GoodBye(3);
	byeworld.GoodBye();

	helloworld.spitItOut();
	somehello1.spitItOut();
	somehello2.spitItOut();

	byeworld.sayGoodBye();
	somebye3.sayGoodBye();
    }
}
