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
        String first_expected = "elmt0";
        MyList<String> list = mock(MyList.class);
        Mockito.when(list.length()).thenReturn(3);
        ForwardIterator<String> iterator = new ForwardIterator<>(list);

        for(int i = 0; i < 4; i++)
            Mockito.when(list.getElement(i)).thenReturn("elmt" + Integer.toString(i));

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
