import application.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void initStream() {
        //setto come output l'outContent, quindi il programma quando stampa con il sysout inserisce il contenuto dentro outContent
        System.setOut(new PrintStream(outContent));
        //setto come error l'errContent
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        //reimposto il sysout, in modo che rediriga l'output normalmente, non più in outContent
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void TestFileReaderPrintBackword() throws IOException, URISyntaxException {

        Main.main(null);

        assertEquals("?\r\n" +
                "tu\r\n" +
                "tutto bene\r\n" +
                "come va\r\n" +
                "ciao\r\n", outContent.toString());
    }
}