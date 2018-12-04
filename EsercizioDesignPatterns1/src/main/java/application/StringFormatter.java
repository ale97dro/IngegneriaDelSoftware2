import iterator.BackwardIterator;
import iterator.MyIterator;
import mylist.MyList;

public class StringFormatter {

    public static MyIterator<String> uppercase(MyIterator<String> text)
    {
        MyList<String> list = new MyList<>();

        while(text.hasMoreElements())
        {
            list.addElement(text.nextElement().toUpperCase());
        }

        text.rewind();

        if(text instanceof BackwardIterator)
            return list.getBackwardIterator();

        return list.getForwardIterator();
    }
}
