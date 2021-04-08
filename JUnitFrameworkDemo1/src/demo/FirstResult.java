package demo;

public class FirstResult 
{

	public static int FindMaxNum(int arr[])
	{
		int max=arr[0];
		
		for( int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				
				max=arr[i];
			}
		}
		
		
		
		return max;
		
	}
	
	public static boolean EvenORNot(int n)
	{
		
		boolean n1=true;
		
		if(n%2!=0)
		{
			n1=false;
			
		}
		return n1;
		
	}
	
	
	
	
}
