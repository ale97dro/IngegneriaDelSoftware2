package iterator;

import mylist.MyList;

public class BackwardIterator<T> implements MyIterator<T>
{
    protected MyList<T> list;
    protected int next;

    public BackwardIterator(MyList<T> list)
    {
        this.list = list;
        this.next = list.length() - 1;
    }

    @Override
    public void rewind()
    {
        next = list.length() - 1;
    }

    @Override
    public T nextElement() {
        return list.getElement(next--);
    }

    @Override
    public boolean hasMoreElements()
    {
        return (next >= 0);
    }
}
