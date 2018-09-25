package Old;

//Old worker
public class Worker 
{	
	public static int conversion(int value)
	{
		if(value%2==0)
			return value/2;
		else
			return (value*3)+1;
	}
	
	public static int sequence(int startingValue) throws Exception
	{
		if(startingValue<=2)
			throw new Exception();
		
		int value = startingValue;
		int length = 0;
		
		while(value>1)
		{
			value=conversion(value);
			length++;
		}
		
		return length;
	}
}
