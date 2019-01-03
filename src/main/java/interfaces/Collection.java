package interfaces;

/*
A default method can call other methods. For example, a Collection interface can
define a convenience method
 */

public interface Collection
{
    int size(); // An abstract method
    default boolean isEmpty()
    {
        return size() == 0;
    }
}
