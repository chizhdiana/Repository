package test1.collections.deque;

/**
 * Created by diana on 10.11.16.
 */
public class ArrayDeque<E> implements Deque<E> {

    private E[] array;
    private int size;

    public ArrayDeque() {
        array = (E[]) new Object[100];
        size = 0;
    }

    /***************** STACK *******************/
    @Override
    public boolean push(E element) {
        return false;
    }

    @Override
    public E pop() {
        return null;
    }
    /***************** STACK *******************/

    /***************** QUEUE *******************/
    @Override
    public boolean offer(E element) {
        return false;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }
    /***************** QUEUE *******************/

    /***************** DEQUE *******************/
    @Override
    public void addFirst(E element) {
        if (size < array.length) {
            shiftToRight(array);
            array[0] = element;
            size++;
        }
    }

    @Override
    public void addLast(E element) {
        if (size < array.length) {
            array[size++] = element;
        }
    }

    @Override
    public boolean offerFirst(E element) {
        if (size < array.length) {
            shiftToRight(array);
            array[0] = element;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public boolean offerLast(E element) {
        if (size < array.length) {
            array[size++] = element;
            return true;
        }
        return false;
    }

    @Override
    public E peekFirst() {
        return array[0];
    }

    @Override
    public E peekLast() {
        return array[size - 1];
    }

    @Override
    public E pollFirst() {
        E elem = array[0];
        shiftToLeft(array);
        size--;
        return elem;
    }

    @Override
    public E pollLast() {
        return array[--size];
    }
    /***************** DEQUE *******************/

    /***************** наыее *******************/
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < size; i++) {
            if (i < size - 1) {
                builder.append(array[i] + ", ");
            } else {
                builder.append(array[i]);
            }
        }
        builder.append("]");
        return builder.toString();
    }

    @Override
    public boolean contains(E elem) {
        return false;
    }

    @Override
    public int indexOf(E elem) {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    /***************** наыее *******************/

    private void shiftToRight(E[] arr) {
        System.arraycopy(arr, 0, arr, 1, size);
    }

    private void shiftToLeft(E[] arr) {
        System.arraycopy(arr, 1, arr, 0, size);
    }

}