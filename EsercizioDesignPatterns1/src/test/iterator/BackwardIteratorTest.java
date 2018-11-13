package iterator;

import iterator.BackwardIterator;
import mylist.MyList;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

public class BackwardIteratorTest {

    private MyList<String> list;
    BackwardIterator<String> iterator;

    @BeforeEach
    public void setup()
    {
        list = mock(MyList.class);
        Mockito.when(list.length()).thenReturn(3);
        for(int i = 0; i < 4; i++)
            Mockito.when(list.getElement(i)).thenReturn("elmt" + Integer.toString(i));

         iterator = new BackwardIterator<>(list);

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
        String first_expected = "elmt2";
        int counter = 2;

        while (iterator.hasMoreElements())
        {
            assertEquals("elmt" + Integer.toString((counter)), iterator.nextElement());
            counter--;
        }

        iterator.rewind();
        assertEquals(first_expected, iterator.nextElement());
    }

}
