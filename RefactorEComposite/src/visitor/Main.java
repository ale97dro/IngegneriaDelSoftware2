package visitor;

public class Main
{
    public static void main(String[] args)
    {
        CompositeOrganization root = new CompositeOrganization("Root SRL");

        //Dipendenti della root
        Person p1 = new Person("Mario", "Rossi"); //dipendente di Root SPA
        Person p2 = new Person("Andrea", "Verdi"); //dipendente di Root SPA

        //Sotto-organizzazioni
        CompositeOrganization dip1 = new CompositeOrganization("Dipartimento 1"); //Dipartimento di Root SPA
        CompositeOrganization dip2 = new CompositeOrganization("Dipartimento 2"); //Dipartimento di Root SPA

        //Dipendenti delle sotto organizzazioni
        Person p3 = new Person("Davide", "Grigi"); //dipendente di Dipartimento 1
        Person p4 = new Person("Sergio", "Neri"); //dipendente di Dipartimento 2

        //Sotto-organizzazioni delle sotto-organizzazioni
        CompositeOrganization t1 = new CompositeOrganization("Team 1"); //Team di Dipartimento 1

        //Dipendenti delle sotto-organizzazioni delle sotto-organizzazioni
        Person p5 = new Person("Daniele", "Gialli"); //dipendente di Team 1

        //Composizione della gerarchia
        t1.addPerson(p5);
        dip1.addOrganization(t1);
        dip1.addPerson(p3);
        dip2.addPerson(p4);
        root.addOrganization(dip1);
        root.addOrganization(dip2);
        root.addPerson(p1);
        root.addPerson(p2);

        root.accept(new CompositeOrganizationVisitor());
    }
}
