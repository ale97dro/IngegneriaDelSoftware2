package composite;

public class Person implements Component
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
    public void printElement()
    {
        System.out.println(toString());
    }
}
