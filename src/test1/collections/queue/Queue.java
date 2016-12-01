package test1.collections.queue;

import test1.collections.Collection;

/**
 * Created by diana on 10.11.16.
 */


public interface Queue<E> extends Collection<E> {

    boolean offer(E element);
    E poll();

}
