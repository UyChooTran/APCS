import java.text.NumberFormat;

public class TestWorkersKey
{
	public static void main(String[] args)
	{
	    
		// Create an hourly worker named Sally that makes 13.75 per hour
		HourlyWorker h = new HourlyWorker("Sally", 13.75);
		// Create a salaried worker named Harry that also makes 13.75 per hour
		SalariedWorker s = new SalariedWorker("Harry", 13.75);
		// Output the Sally and her vitals plus how much she makes if she works 30 hours
		System.out.println(h + " and makes " + computePay(h, 30) +
					    " for working 30 hours this week.");
		// Output the Harry and his vitals plus how much he makes if he works 30 hours
		System.out.println(s + " and makes " + computePay(s, 30) + 
					    " for working 30 hours this week.");
		// Output the Sally and her vitals plus how much she makes if she works 50 hours
		System.out.println(h + " and makes " + computePay(h, 50) + 
					    " for working 50 hours this week.");
		// Output the Harry and his vitals plus how much he makes if he works 50 hours
		System.out.println(s + " and makes " + computePay(s, 50) + 
					    " for working 50 hours this week.");
	}
	
	/**
	 *	This method returns the amount of pay a worker makes for working
	 *	the number of hours passed.
	 *	@param w the worker to compute the weekly pay for.
	 *	@param hours the number of hours the worked work for the week.
	 *	@return returns a string representing the money amount earned for
	 *			the week.  The string is formatted in US currency.
	 */
	public static String computePay(Worker w, double hours)
	{
		// Create the money formatter
		NumberFormat mformatter = NumberFormat.getCurrencyInstance();
		// Compute the pay for the week for the work, and
		// convert the numeric amount into US currency string format.
		return mformatter.format(w.computePay(hours));
	}
}


/*
Output is:
	
Sally hourly rate is 13.75 and makes $412.50 for working 30 hours this week.
Harry salaried rate is 13.75 and makes $550.00 for working 30 hours this week.
Sally hourly rate is 13.75 and makes $756.25 for working 50 hours this week.
Harry salaried rate is 13.75 and makes $550.00 for working 50 hours this week.

*/