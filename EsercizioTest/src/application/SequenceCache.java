package application;
import java.util.HashMap;
import java.util.Map;

public class SequenceCache 
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mappa == null) ? 0 : mappa.hashCode());
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
		SequenceCache other = (SequenceCache) obj;
		if (mappa == null) {
			if (other.mappa != null)
				return false;
		} else if (!mappa.equals(other.mappa))
			return false;
		return true;
	}

	Map<Integer, Worker> mappa;
	
	public SequenceCache()
	{
		mappa = new HashMap<Integer, Worker>();
	}
	
	public int length(int value)
	{
		//try: se trovo con get() l'elemento è presente, altrimenti va inserito
		try 
		{
			return mappa.get(value).sequence();
		} 
		catch (Exception e) 
		{
			Worker temp = new Worker(value);
			mappa.put(value, temp);
			
			return temp.sequence();
		}
	}
}
