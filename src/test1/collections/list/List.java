package test1.collections.list;

/**
 * Created by diana on 14.11.16.
 */

import test1.collections.Collection;



public interface List<E> extends Collection<E> {

    void add(E element);

    void add(int index, E element);

    void addAll(Collection<? extends E> collection);

    void addAll(int index, Collection<? extends E> collection);

    E get(int index);

    E set(int index, E element);

    E remove(int index);

    List<E> subList(int indexFrom, int indexTo);

}
