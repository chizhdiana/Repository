package test1.collections.deque;

/**
 * Created by diana on 10.11.16.
 */

import test1.collections.queue.Queue;
import test1.collections.stack.Stack;
import java.util.NoSuchElementException;

/**
 * Created by IEvgen Boldyr on 27.05.16.
 * Project: OOP - Base002
 *
 * Интерфейс двунаправленной очереди
 */

public interface Deque<E> extends Queue<E>, Stack<E> {
    /**Возвращает но не удаляет элемент из начала очереди,
     * @throws NoSuchElementException - если очередь пуста*/
    //public E element() throws NoSuchElementException;

    /**Добавляет элемент в конец очереди,
     * @return true  - элемент удачно добавлен
     *         false - элемент не добавлен*/
    public boolean offer(E element);

    /**Возвращает без удаления элемент из начала очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public E peek();

    /**Возвращает c удалением элемент из начала очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public E poll();

    /**Возвращает c удалением элемент из начала очереди
     * @return int element - возврщает значение элемента
     * @throws NoSuchElementException  - если очередь пуста*/
    //public E remove() throws NoSuchElementException;

    /**Добавляет элемент в начало очереди*/
    public void addFirst(E element);

    /**Добавляет элемент в конец очереди*/
    public void addLast(E element);

    /**Возвращает без удаления первый элемент в очереди
     * @return int element - возврщает значение элемента
     * @throws NoSuchElementException  - если очередь пуста */
    //public E getFirst() throws NoSuchElementException;

    /**Возвращает без удаления последний элемент в очереди
     * @return int element - возврщает значение элемента
     * @throws NoSuchElementException  - если очередь пуста */
    //public E getLast() throws NoSuchElementException;

    /**Добавляет элемент в начало очереди
     * @return true  - элемент удачно добавлен
     *         false - элемент не добавлен*/
    public boolean offerFirst(E element);

    /**Добавляет элемент в конец очереди
     * @return true  - элемент удачно добавлен
     *         false - элемент не добавлен*/
    public boolean offerLast(E element);

    /**Возвращает без удаления элемент из начала очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public E peekFirst();

    /**Возвращает без удаления элемент из конца очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public E peekLast();

    /**Возвращает c удалением элемент из начала очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public E pollFirst();

    /**Возвращает c удалением элемент из конца очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public E pollLast();

    /**Возвращает c удалением элемент из начала очереди
     * @return int element - возврщает значение элемента
     * @throws NoSuchElementException  - если очередь пуста*/
    //public E removeFirst() throws NoSuchElementException;

    /**Возвращает c удалением элемент из конца очереди
     * @return int element - возврщает значение элемента
     * @throws NoSuchElementException  - если очередь пуста*/
    //public E removeLast() throws NoSuchElementException;
}

