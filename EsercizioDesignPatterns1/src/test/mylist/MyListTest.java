package mylist;//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

import mylist.MyList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyListTest {

    MyList<String> list;

    @BeforeEach
    public void setup()
    {
        list = new MyList<>();
    }

    /**
     * This printOutput tests the following method:
     *     - addElement
     *     - length
     *     - getElement
     */
    @Test
    public void test01()
    {
        String expected_element = "ciao";
        int expected_length = 1;

        list.addElement("ciao");

        assertEquals(expected_element, list.getElement(0));
        assertEquals(expected_length, list.length());

        try
        {
            list.getElement(1);
            fail();
        }
        catch (Exception ex)
        {

        }
    }

    /**
     * This printOutput tests iterator related method
     */
    @Test
    public void test02()
    {
        assertNotNull(list.getBackwardIterator());
        assertNotNull(list.getForwardIterator());
    }
}
