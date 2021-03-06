package Solutions;
/*
 * Author - Alexander Kohler
 * 
 */
public class Problem001 {

	/*
	If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	Find the sum of all the multiples of 3 or 5 below 1000.
	 */
	//Speed - 0ms
	
	
	public static int eulerOne()
	{
		long startTime = System.currentTimeMillis();
		int sum = 0;
	for (int i = 0; i < 1000; i++)
	{
		if ((i % 5) == 0 || ((i % 3)) == 0)
			sum = sum + i;
	}
	long endTime = System.currentTimeMillis();
	System.out.println("That took " + (endTime - startTime) + " milliseconds");
	return sum;
	}
	
	
	public static void main (String args[])
	{
		System.out.println(eulerOne());
	}
	
	
	
	
}
