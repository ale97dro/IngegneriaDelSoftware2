import java.util.List;

public class ForwardIterator<T> implements MyIterator<T>
{
    private MyList<T> list;
    private int next;

    public ForwardIterator(MyList<T> list)
    {
        this.list = list;
        this.next = 0;
    }

    @Override
    public void rewind() {
        next = 0;
    }

    @Override
    public T nextElement() {
        return list.getElement(next++);
    }

    @Override
    public boolean hasMoreElements() {
        return (next < list.length());
    }
}
