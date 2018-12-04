import iterator.MyIterator;

import java.io.PrintStream;
import java.util.List;

public class Printer
{

    public static void printOutput(MyIterator<String> text, List<PrintStream> streams)
    {
        for(PrintStream s : streams)
            printOutput(text, s);
    }

    public static void printOutput(MyIterator<String> text, PrintStream stream)
    {
        while(text.hasMoreElements())
            stream.println(text.nextElement());
        text.rewind();
    }
}
