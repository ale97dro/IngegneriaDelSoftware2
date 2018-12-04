package visitor;

public class CompositeOrganizationVisitor implements Visitor {
    @Override
    public void visit(Person p) {

    }

    @Override
    public void visit(CompositeOrganization org)
    {
        System.out.println(org.getName());

        for(Person p : org.getEmployee())
            p.accept(new PersonVisitor());

        for(CompositeOrganization o : org.getSubOrganization())
            o.accept(new CompositeOrganizationVisitor());
    }
}
