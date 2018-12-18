package visitor;

public class Person implements Element
{
    private String name;
    private String surname;

    public Person(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    @Override
    public String toString()
    {
        return name + " " + surname;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
