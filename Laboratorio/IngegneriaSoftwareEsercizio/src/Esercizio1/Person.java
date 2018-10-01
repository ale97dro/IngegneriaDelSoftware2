package Esercizio1;
public class Person 
{
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) throws InstantiationException 
    {
        if (firstName == null || firstName.isEmpty()) {
            throw new InstantiationException();
        }

        if (lastName == null || lastName.isEmpty()) {
            throw new InstantiationException();
        }

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }
    
    @Override
    public String toString()
    {
    	StringBuilder nomeStampato = new StringBuilder();
    	
    	
    	String[] vettore=firstName.split(" ");
    	
    	for(int i=0;i<vettore.length;i++)
    	{
    		nomeStampato.append(Character.toUpperCase(vettore[i].charAt(0)));
        	nomeStampato.append(vettore[i].substring(1));
        	
        	nomeStampato.append(" ");
    	} 
    	
    	vettore=lastName.split(" ");
    	for(int i=0;i<vettore.length;i++)
    	{
    		nomeStampato.append(Character.toUpperCase(vettore[i].charAt(0)));
        	nomeStampato.append(vettore[i].substring(1));
    	}

    	return nomeStampato.toString();
    }
}