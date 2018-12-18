package visitor;

import visitor.aop.Annotation;

public interface Visitor {
    @Annotation
    public void visit(Person p);
    @Annotation
    public void visit(Organization org);
}
