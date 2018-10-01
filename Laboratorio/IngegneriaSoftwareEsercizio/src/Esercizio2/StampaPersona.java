package Esercizio2;

public class StampaPersona {
	
	public static String stampaPersona(Person p)
	{
		StringBuilder nomeStampato = new StringBuilder();
    	
    	String[] vettore=p.getFirstName().split(" ");
    	
    	for(int i=0;i<vettore.length;i++)
    	{
    		nomeStampato.append(Character.toUpperCase(vettore[i].charAt(0)));
        	nomeStampato.append(vettore[i].substring(1));
        	
        	nomeStampato.append(" ");
    	} 
    	
    	vettore=p.getLastName().split(" ");
    	
    	for(int i=0;i<vettore.length;i++)
    	{
    		nomeStampato.append(Character.toUpperCase(vettore[i].charAt(0)));
        	nomeStampato.append(vettore[i].substring(1));
    	}

    	return nomeStampato.toString();
	}
}
