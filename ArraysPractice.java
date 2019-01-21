import java.util.Arrays;

class	ArraysPractice
{

	public static void main(String args[])
	{
		int[]	list = {-7,	5,	6,	3,	3,	3,	3};
		System.out.println(isDecreasing(list));
		System.out.print(mostFrequent(list));
	}

//-----------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------
/**
* Determines if the numbers in an array of integers are in decreasing order. Each
* prior number	has to be greater	than the	following number for	the array to be
* considered decreasing.
* Precondition: array containing	at	least	one element
* @param	array	the array of integers
* @return boolean	true if numbers are decreasing, false otherwise
*/
	public static boolean isDecreasing (int[]	array)
	{
		//loop comparing that next	index	is	more than last	one
		
		for (int	index	= 0; index < array.length;	index++)
		{
			//if last number,	swap checking
			if	((array.length	- 1) == index){
				if	(array[index] > array[index -	1])
				{
					return false;
				}
				else
					return true;
			}//last

			if	(array[index] < array[index +	1])
			{
				return false;
			}
		}//for
		
		return true;  
		
	}//isDecreasing end
//-----------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------
	//most frequent
	
	public static int	mostFrequent (int[] array)
	{	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//collect data	by	using	loop and	store	#,	count, in list. Evens #, odds	count. Then	synthesize in readable form later.
		int[]	data = new int[array.length *	2]; //makes	a list to put data in
		int counter	= 1; // amount	of	time number	found
		int place =	0;	//place where to put	number in data
		for (int	index	= 0; index < array.length;	index++)
		{
			for (int	search =	1 + index; search	< array.length; search++)
			{
				if	(array[search]	==	array[index]) //if the searched is the	same as the	index	of	the loop
					counter++; //found a	duplicate
				
				
			}//for minis
			
			data[place]	= array[index]; //inputs the number	counted in {even}	place
			place++;	//moves where to put	next 
			data[place]	= counter; //inputs amount	of	times	number was found {odd}
			counter = 1; //resets counter
			place++;	//moves up substitution	place
			
		}//for big boi
		//System.out.print(Arrays.toString(data));
		//////////////////////////////////////////////////////////////////////////////////////
		//Part 2///work with	data
		/////////////////////////////////
		
		//loop to find	biggest odd	number from	data
		int maxTwo = 0; 
		for (int	index	= 1; index < data.length; index += 2)
		{
			if	(data[index] >	maxTwo)
				maxTwo =	data[index];
		
		}
		
		
		//locate	biggest odd	number again
	  for	(int index = 1; index <	data.length; index += 2)
		{
			if	(data[index] == maxTwo)
				//-1 index B.O.N.	to	find the	number it represetns
				return data[index-1];
		
		}

	   return 666;
	} 
	
	
/**
*	Returns an array of all	elements	greater than the first element in an array of
*	integers. If no values are	greater than the first,	or	if	the array is empty, return	an	empty	array.
*	Precondition: array of integers,	possibly	an	empty	array
*	@param array		- the	array	of	integers
*	@return int[]		- array of numbers greater	than first,	or	an	empty	array

	Sample Data									Sample Output
	[-99,1,2,3,4,5,6,7,8,9,10,5]			[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5]
	[10,9,8,7,6,5,4,3,2,1,-99]				[]
	[10,20,30,40,50,-11818,40,30,20,10]	[20, 30,	40, 50, 40,	30, 20]
	[32767]										[]
	[255,255]									[]
	[]												[]
*/
public static int[] greaterVals(int[] array)
	{
	
		int[]	arrayGreaterVals = new int[array.length];
		if	(array.length == 0)
			return arrayGreaterVals;
			
		int firstElementValue =	array[0];
		
		//	Run through	input	array	elements	locate
		for (int	index	= 1; index < array.length;	index	++)
		{
			if	(array[index] > firstElementValue)
			{
				arrayGreaterVals[] =	array[index];
			}
		}
		
		return 666;
	}
  
}//end Class