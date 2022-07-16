package stringcalc;

import java.util.ArrayList;

public class Calculator 
{
	public static int add(String number)
	{
		String[] numbers = number.split(",");
		int size=numbers.length;
		throwExceptionIfAnyNegative(numbers,size);
		//if(number.isEmpty())
		//{
			//return 0;
		//}
		
		return findsum(numbers,size);
	}
	private static void throwExceptionIfAnyNegative(String[] numbers, int size) {
		ArrayList<String> negative = new ArrayList<String>();
		for(int i=0;i<size;i++)
		{
			if(Integer.parseInt(numbers[i])<0)
			{
				negative.add(numbers[i]);
			}
		}
		if(negative.size()>0)
		{
			throw new RuntimeException("negatives not allowed");
		}
		
	}
	private static boolean CustomDelimiter(String number) {
		return number.startsWith("//");
	}

	private static String[] splitCommaAndNewLine(String number) {
		String[] numbers=number.split(",|\n");
		return numbers;
	}
	private static int findsum(String[] numbers, int size) {
		int sum=0;
		for(int i=0; i<size; i++){
			sum = sum + Integer.parseInt(numbers[i]);
		}
		return sum;
	}
	
	
	

}
