package edu.berkeley.path;

/**
 * It just does stuff.
 *
 */
public class Conversation
{
    private int numWords = 0;

    public Conversation()
    {
	numWords = 1;
    } 

    public Conversation(int num)
    {
	numWords = num;
    }

    public int getValue()
    {
	return numWords;
    }
}
