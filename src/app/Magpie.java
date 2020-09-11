package app;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>

 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, what's crackalackin?";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
        statement = statement.toLowerCase().strip();
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
        }
        else if (statement.indexOf("cat") >= 0
        || statement.indexOf("dog") >= 0
        || statement.indexOf("fish") >= 0
        || statement.indexOf("hamster") >= 0)
        {
        response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Mr. Adiletta") >= 0
        || statement.indexOf("teacher") >= 0
        || statement.indexOf("Mr. A") >= 0
        || statement.indexOf("computer science") >= 0)
        {
        response = "Mr. Adiletta is so nice.";
		}
		else if (statement.indexOf("Horse") >= 0
        || statement.indexOf("animal") >= 0
        || statement.indexOf("herd") >= 0
        || statement.indexOf("wild") >= 0)
        {
        response = "Tell me more about your horse.";
		}
		else if (statement.indexOf("Brynn") >= 0
        || statement.indexOf("student") >= 0
        || statement.indexOf("girl") >= 0
        || statement.indexOf("crazy") >= 0)
        {
        response = "OMG I know Brynn.";
		}
		else if(statement.length() == 0);
		{
		response = "Say something please.";
		}
		
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Lol.";
		}
		else if (whichResponse == 5)
		{
			response = "Wow.";
		}
		return response;
	}
}
