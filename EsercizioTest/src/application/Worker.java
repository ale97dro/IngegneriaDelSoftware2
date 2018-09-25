package application;

public class Worker 
{	
	private int startingValue;
	
	public Worker(int startingValue)
	{
		if(startingValue<=2)
			this.startingValue=3;
		else
			this.startingValue = startingValue;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + startingValue;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		if (startingValue != other.startingValue)
			return false;
		return true;
	}

	public static int conversion(int value)
	{
		if(value%2==0)
			return value/2;
		else
			return (value*3)+1;
	}
	
	public int sequence()
	{
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
