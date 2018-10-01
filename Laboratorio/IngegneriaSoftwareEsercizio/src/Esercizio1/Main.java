package Esercizio1;

public class Main 
{
	public static void main(String[] args)
	{
		Person p = null;
		
		try
		{
			p = new Person("maria chiara", "rossi");
		}
		catch(Exception ex)
		{
			System.out.println("Credenziali non corrette");
		}
		
		System.out.println(p);
	}
}
