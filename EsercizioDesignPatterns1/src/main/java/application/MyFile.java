package application;

import mylist.MyList;

import java.io.*;

public class MyFile {

    private MyList<String> rows;

    private MyFile()
    {
        rows = new MyList<>();
    }

    public MyFile(String path) throws IOException
    {
        this();

        String row;
        BufferedReader reader = new BufferedReader(new FileReader(new File("file.txt")));
        while ((row = reader.readLine()) != null)
            rows.addElement(row);
    }

    public MyFile(Reader reader) throws IOException
    {
        this();

        String row;
        reader = new BufferedReader(reader); //wrap

        while ((row = ((BufferedReader)reader).readLine()) != null)
            rows.addElement(row);
    }

    public void printForward(PrintStream stream, Formatter formatter)
    {
        stream.println(formatter.format(rows.getForwardIterator()));
    }

    public void printBackward(PrintStream stream, Formatter formatter)
    {
        stream.println(formatter.format(rows.getBackwardIterator()));
    }
}
