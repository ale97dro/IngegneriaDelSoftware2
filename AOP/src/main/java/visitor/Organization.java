package visitor;

import com.google.inject.Inject;
import visitor.aop.Annotation;

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

    @Inject
    public Organization()
    {
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
    @Annotation
    public void accept(Visitor v) {
        v.visit(this);
    }
}
