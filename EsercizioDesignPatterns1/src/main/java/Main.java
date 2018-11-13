import iterator.MyIterator;
import mylist.MyList;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException
    {
        ClassLoader classLoader = Main.class.getClassLoader();
        BufferedReader reader = new BufferedReader(new FileReader(new File(classLoader.getResource("file.txt").toURI())));

        Function<MyIterator<String>, MyIterator<String>> formatter = StringFormatter::uppercase; //scelgo opzione utente

        MyList<String> textRows = new MyList<>();
        String row;

        while ((row = reader.readLine()) != null)
            textRows.addElement(row);

        MyIterator<String> iterator = textRows.getBackwardIterator();

        MyIterator<String> formatted_iterator = formatter.apply(iterator);

        List<PrintStream> outputStreams = new ArrayList<>();
        outputStreams.add(System.out);
        outputStreams.add(System.out);
        Printer.printOutput(formatted_iterator, outputStreams);

        Printer.printOutput(formatter.apply(iterator), System.out);
    }
}
