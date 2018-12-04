package visitor;

public class PersonVisitor implements Visitor
{
    @Override
    public void visit(Person p) {
        //p.printEmployee();
        System.out.println(p.toString());
    }

    @Override
    public void visit(CompositeOrganization org) {
        //org.printEmployee();
    }
}
