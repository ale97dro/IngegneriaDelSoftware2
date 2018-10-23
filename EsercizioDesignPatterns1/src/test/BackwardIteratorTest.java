import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

public class BackwardIteratorTest {

    MyList<String> list;

    @SuppressWarnings("Duplicates")
    @BeforeEach
    public void setup()
    {
        list = spy(new MyList<>());

        for(Integer i = 1; i < 4; i++)
        {
            list.addElement(i.toString());
            Mockito.verify(list).addElement(i.toString());
        }
    }

    /**
     * This test tests the following methods:
     *      - Constructor
     *      - rewind
     *      - nextElement
     *      - hasMoreElements
     */
    @Test
    public void test01()
    {
        MyIterator<String> iterator = list.getBackwardIterator();
        Integer counter = 3;

        while (iterator.hasMoreElements())
        {
            assertEquals((counter).toString(), iterator.nextElement());
            counter--;
        }

        iterator.rewind();
        assertEquals("3", iterator.nextElement());
    }
}
