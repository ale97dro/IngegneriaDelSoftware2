package visitor;

import java.util.ArrayList;
import java.util.List;

public class CompositeOrganization implements Element
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

    public List<Person> getEmployee()
    {
        return persons;
    }

    public List<CompositeOrganization> getSubOrganization()
    {
        return organizations;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
