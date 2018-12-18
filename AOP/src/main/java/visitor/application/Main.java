package visitor.application;

import com.google.inject.Guice;
import com.google.inject.Injector;
import visitor.CountVisitor;
import visitor.Organization;
import visitor.Person;
import visitor.PrintVisitor;
import visitor.aop.ConfigurationModule;

public class Main
{
    public static void main(String[] args)
    {
        Injector injector = Guice.createInjector(new ConfigurationModule());

        Organization root = injector.getInstance(Organization.class);
        //Organization root = new Organization("Root SRL");
        //Dipendenti della root
        Person p1 = new Person("Mario", "Rossi"); //dipendente di Root SPA
        Person p2 = new Person("Andrea", "Verdi"); //dipendente di Root SPA

        //Sotto-organizzazioni
        Organization dip1 = new Organization("Dipartimento 1"); //Dipartimento di Root SPA
        Organization dip2 = new Organization("Dipartimento 2"); //Dipartimento di Root SPA

        //Dipendenti delle sotto organizzazioni
        Person p3 = new Person("Davide", "Grigi"); //dipendente di Dipartimento 1
        Person p4 = new Person("Sergio", "Neri"); //dipendente di Dipartimento 2

        //Sotto-organizzazioni delle sotto-organizzazioni
        Organization t1 = new Organization("Team 1"); //Team di Dipartimento 1

        //Dipendenti delle sotto-organizzazioni delle sotto-organizzazioni
        Person p5 = new Person("Daniele", "Gialli"); //dipendente di Team 1

        //Composizione della gerarchia
        t1.addElement(p5);
        dip1.addElement(p3);
        dip1.addElement(t1);
        dip2.addElement(p4);
        root.addElement(p1);
        root.addElement(p2);
        root.addElement(dip1);
        root.addElement(dip2);

        root.accept(new PrintVisitor());

        CountVisitor counter = new CountVisitor("Dipartimento 1");
        root.accept(counter);
        System.out.println("Lavoratori: " + counter.getCounter());
    }
}
