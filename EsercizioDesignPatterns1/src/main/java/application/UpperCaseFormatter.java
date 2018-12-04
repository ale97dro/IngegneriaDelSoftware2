package application;

import iterator.BackwardIterator;
import iterator.MyIterator;
import mylist.MyList;

public class UpperCaseFormatter implements Formatter {
    @Override
    public String format(MyIterator<String> text) {
        StringBuilder str = new StringBuilder();

        while(text.hasMoreElements())
            str.append(text.nextElement().toUpperCase() + "\n");

        text.rewind();

        return str.toString();
    }
}
