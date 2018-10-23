public class Main {
    public static void main(String[] args)
    {
        MyList<String> stringList = new MyList<>();

        stringList.addElement("ciao");
        stringList.addElement("come");
        stringList.addElement("va");

        MyIterator<String> forwardIterator = stringList.getForwardIterator();

        System.out.println(forwardIterator.nextElement()+"\n");

        stringList.addElement("ciao");
        forwardIterator.rewind();

        while(forwardIterator.hasMoreElements())
            System.out.println(forwardIterator.nextElement());

        System.out.println("\n");

        MyIterator<String> backwardIterator = stringList.getBackwardIterator();

        while(backwardIterator.hasMoreElements())
            System.out.println(backwardIterator.nextElement());
    }
}
