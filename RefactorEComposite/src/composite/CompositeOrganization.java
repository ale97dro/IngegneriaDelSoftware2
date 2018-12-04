package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeOrganization implements Employee
{
    private String name;
    private List<Person> persons;
    private List<CompositeOrganization> organizations;

    public CompositeOrganization(String name)
    {
        this.name = name;
        persons = new ArrayList<>();
        organizations = new ArrayList<>();
    }

    public void addPerson(Person p)
    {
        persons.add(p);
    }

    public void addOrganization(CompositeOrganization o)
    {
        organizations.add(o);
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void printEmployee()
    {
        System.out.println(name);
        for(Person p : persons)
            p.printEmployee();
        for(CompositeOrganization o : organizations)
            o.printEmployee();
    }
}
