package visitor;

public interface Visitor {
    public void visit(Person p);
    public void visit(Organization org);
}
