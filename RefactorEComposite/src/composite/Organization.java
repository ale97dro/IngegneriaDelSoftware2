package composite;

import java.util.ArrayList;
import java.util.List;

public class Organization implements Component
{
    private String name;
    private List<Component> elements;

    public Organization(String name)
    {
        this.name = name;
        elements = new ArrayList<>();
    }

    public void addElement(Component c)
    {
        elements.add(c);
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void printElement()
    {
        System.out.println(name);
        for(Component p : elements)
            p.printElement();
    }
}