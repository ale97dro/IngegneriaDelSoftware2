package visitor;

public class PrintVisitor implements Visitor
{
    @Override
    public void visit(Person p) {
        System.out.println(p.toString());
    }

    @Override
    public void visit(Organization org)
    {
        System.out.println(org.getName());

        for(Element e : org.getElements())
            e.accept(new PrintVisitor());
    }
}
