package iterator;

import iterator.ForwardIterator;
import iterator.MyIterator;
import mylist.MyList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class ForwardIteratorTest
{
    private MyList<String> list;
    private ForwardIterator<String> iterator;

    @BeforeEach
    public void setup()
    {
        list = mock(MyList.class);
        Mockito.when(list.length()).thenReturn(3);

        for(int i = 0; i < 4; i++)
            Mockito.when(list.getElement(i)).thenReturn("elmt" + Integer.toString(i));

        iterator = new ForwardIterator<>(list);
    }
    /**
     * This printOutput tests the following methods:
     *      - Constructor
     *      - rewind
     *      - nextElement
     *      - hasMoreElements
     */
    @Test
    public void test01()
    {
        String first_expected = "elmt0";




        int counter = 0;
        while (iterator.hasMoreElements())
        {
            assertEquals("elmt" + Integer.toString((counter)), iterator.nextElement());
            counter++;
        }

        iterator.rewind();
        assertEquals(first_expected, iterator.nextElement());
    }
}
