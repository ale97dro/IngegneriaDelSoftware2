package visitor;

public class CountVisitor implements Visitor {

    private String organizationName;
    private int counter;

    public CountVisitor(String organizationName)
    {
        this.organizationName = organizationName;
        this.counter = 0;
    }


    public int getCounter()
    {
        return counter;
    }

    @Override
    public void visit(Person p) {
        counter++;
    }

    @Override
    public void visit(Organization org) {
        for (Element e : org.getElements())
            e.accept(this);
    }
}
