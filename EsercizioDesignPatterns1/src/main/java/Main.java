import java.io.*;
import java.net.URISyntaxException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException
    {
        ClassLoader classLoader = Main.class.getClassLoader();
        BufferedReader reader = new BufferedReader(new FileReader(new File(classLoader.getResource("file.txt").toURI())));

        MyList<String> textRows = new MyList<>();
        String row;

        while ((row = reader.readLine()) != null)
            textRows.addElement(row);

        MyIterator<String> iterator = textRows.getBackwardIterator();

        while(iterator.hasMoreElements())
            System.out.println(iterator.nextElement());
    }
}
