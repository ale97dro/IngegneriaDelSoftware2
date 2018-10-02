package Frazioni;

public class Frazione 
{
	private long numeratore;
	private long denominatore;

	/**
	 * Check if denom is set with 0
	 * @param denominatore
	 * @throws ArithmeticException
	 */
	private void setDenominatore(long denominatore) throws ArithmeticException
	{
		if(denominatore==0)
			throw new ArithmeticException("Division by 0");
		this.denominatore = denominatore;
	}
	
	public Frazione(long numeratore, long denominatore) throws ArithmeticException
	{
		this.numeratore=numeratore;
		setDenominatore(denominatore);
		
		checkSign();
	}
	
	/**
	 * Sum of fractions.
	 * @param f
	 * @return New fraction that is the sum of this and f
	 * @throws Exception
	 */
	public Frazione sum(Frazione f) throws ArithmeticException
	{
		long comdenom = MCM(this.denominatore, f.denominatore);
		long newnum = (comdenom/denominatore)*numeratore + (comdenom/f.denominatore)*f.numeratore;
		
		return minimize(new Frazione(newnum, comdenom));
	}
	
	/**
	 * Subtraction of fractions.
	 * @param f
	 * @return
	 */
	public Frazione subtraction(Frazione f)
	{
		long comdenom = MCM(this.denominatore, f.denominatore);
		long newnum = (comdenom/denominatore)*numeratore - (comdenom/f.denominatore)*f.numeratore;
		
		return minimize(new Frazione(newnum, comdenom));
	}
	
	public Frazione multiply(Frazione f)
	{
		long newnum = numeratore*f.numeratore;
		long newden = denominatore*f.denominatore;
		
		return minimize(new Frazione(newnum, newden));
	}
	
	public Frazione division(Frazione f)
	{
		long newnum = numeratore*f.denominatore;
		long newden = denominatore*f.numeratore;
		
		return minimize(new Frazione(newnum, newden));
	}
	
	private Frazione minimize(Frazione f)
	{	
		long GCD = GCD(f.numeratore, f.denominatore);
		
		Frazione temp = new Frazione(f.numeratore/GCD, f.denominatore/GCD);
				
		return temp;
	}
	
	public Frazione minimize()
	{
		return minimize(this);
	}
	
	/**
	 * When a fraction is created, move '-' from denom to num
	 */
	private void checkSign()
	{
		if (denominatore<0)
		{
			numeratore*=(-1);
			denominatore*=(-1);
		}
	}
	
	
	//Serve per semplificare
	private long GCD (long a, long b) 
	{
		   if (b==0) 
			   return a;
		   
		   return GCD(b, a%b);
	}
	
	private long MCM(long n1, long n2)
	{
		return (n1*n2) / GCD(n1, n2);
	}
	
	
	@Override
	public String toString()
	{
		return numeratore+"/"+denominatore;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (denominatore ^ (denominatore >>> 32));
		result = prime * result + (int) (numeratore ^ (numeratore >>> 32));
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
		Frazione other = (Frazione) obj;
		if (denominatore != other.denominatore)
			return false;
		if (numeratore != other.numeratore)
			return false;
		return true;
	}
}
