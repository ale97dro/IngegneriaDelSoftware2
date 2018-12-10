package visitor;

public class PrintVisitor implements Visitor
{
    @Override
    public void visit(Person p) {
        System.out.println(p.toString());
    }

    @Override
    public void visit(CompositeOrganization org)
    {
        System.out.println(org.getName());

        for(Person p : org.getEmployee())
            p.accept(new PrintVisitor());

        for(CompositeOrganization o : org.getSubOrganization())
            o.accept(new PrintVisitor());
    }
}
