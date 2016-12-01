package test1.collections;

/**
 * Created by diana on 10.11.16.
 */

public interface Collection<E> {

    boolean contains(E elem);
    int indexOf(E elem);

    void clear();
    boolean isEmpty();
    int size();
}
