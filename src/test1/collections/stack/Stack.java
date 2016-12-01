package test1.collections.stack;
import test1.collections.Collection;

/**
 * Created by diana on 10.11.16.
 */




public interface Stack<E> extends Collection<E> {

    boolean push(E element);
    E pop();

}
