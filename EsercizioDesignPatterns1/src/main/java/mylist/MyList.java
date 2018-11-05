package mylist;

import iterator.BackwardIterator;
import iterator.ForwardIterator;
import iterator.MyIterator;

import java.util.ArrayList;
import java.util.List;

public class MyList<T>{

    private List<T> list;

    public MyList()
    {
        list = new ArrayList<>();
    }

    private MyList(MyList<T> list)
    {
        this.list = list.list;
    }

    public void addElement(T element)
    {
        list.add(element);
    }

    public int length()
    {
        return list.size();
    }

    public T getElement(int pos)
    {
        if(pos >= list.size())
            throw new IndexOutOfBoundsException();

        T temp = list.get(pos);

        return temp;
    }

    public MyIterator<T> getForwardIterator()
    {
        return new ForwardIterator<T>(new MyList<T>(this));
    }

    public MyIterator<T> getBackwardIterator()
    {
        return new BackwardIterator<>(new MyList<>(this));
    }
}
