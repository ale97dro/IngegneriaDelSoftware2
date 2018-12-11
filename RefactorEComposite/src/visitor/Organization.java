package visitor;

import java.util.ArrayList;
import java.util.List;

public class Organization implements Element
{
    private String name;
    private List<Element> elements;

    public Organization(String name)
    {
        this.name = name;
        elements = new ArrayList<>();
    }

    public void addElement(Element e)
    {
        elements.add(e);
    }

    public String getName()
    {
        return name;
    }

    public List<Element> getElements()
    {
        return elements;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
