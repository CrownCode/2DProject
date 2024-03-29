package TwoDView;

import TwoDModel.HipsterObject;

public class TwoDView 
{
	public void printIntInformation(int [][] currentArray) 
	{
		System.out.println("For-Each Printing");
		for(int [] currentRow : currentArray)
		{
			for(int currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println();
		}
	
	
	System.out.println("for printing");
	for(int row = 0; row < currentArray.length; row++)
	{
		for(int col = 0; col < currentArray[0].length; col++)
		{
			System.out.print(row + "," + col + ": " + currentArray[row][col] + "\t");
		}
		System.out.println();
	}
	}
	
	public void printStringInformation(String [][] currentArray)
	{
		System.out.println("for-each printing");
		for(String [] currentRow : currentArray)
		{
			for(String currentString : currentRow)
			{
				System.out.print(currentString + "\t");
			}
			System.out.println();
		}
	}
	
	public void printHipsterInformation(HipsterObject [][] currentArray)
	{
		System.out.println("for-each printing");
		for(HipsterObject [] currentRow : currentArray)
		{
			for(HipsterObject currentString : currentRow)
			{
				System.out.print(currentString.getName() + "\t");
			}
			System.out.println();
		}
		
		System.out.println("For Printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col ++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col].getName() + "\t");
			}
			System.out.println();
		}
	}	
}
