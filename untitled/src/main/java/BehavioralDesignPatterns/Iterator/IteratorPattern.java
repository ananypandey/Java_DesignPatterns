package BehavioralDesignPatterns.Iterator;

// The Iterator design pattern is a behavioral pattern that provides a way to access the elements of a collection sequentially without exposing its underlying representation.
//Key participants in the Iterator pattern :
// Iterator : This is an interface or an abstract class that declares method for traversing the elements of a collection. It typically includes method like 'hasNext()' to check if there are more elements, and next() to retrieve the next element.
//ConcreteIterator : This is a concrete implementation of the iterator interface. It keeps track of the current position within the collection and implements the traversal methods.

interface Iterator
{
    boolean hasNext();
    Object next();
}
interface Aggregate
{
    Iterator createIterator();
}
class ConcreteIterator implements Iterator
{
    private String[] elements;
    private int position =0;

    public ConcreteIterator(String[] elements)
    {
        this.elements=elements;
    }
    @Override
    public boolean hasNext() {
        return position<elements.length;
    }

    @Override
    public Object next() {
        if(hasNext())
        {
            return elements[position++];
        }
        return null;
    }
}

class ConcreteAggregate implements Aggregate
{
    String[] elements;
    public ConcreteAggregate(String[] elements)
    {
        this.elements=elements;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(elements);
    }
}
public class IteratorPattern
{
    public static void main(String[] args)
    {
        String[] elements = {"A", "B", "C", "D"};
        ConcreteAggregate aggregate = new ConcreteAggregate(elements);
        Iterator iterator = aggregate.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
