package test1.collections.stack;

/**
 * Created by diana on 10.11.16.
 */

import com.sun.istack.internal.Nullable;


public class ArrayStack<E> implements Stack<E> {

    private E[] arr;
    private int size;

    public ArrayStack(int size) {
        arr = (E[]) new Object[size];
        size = 0;
    }

    @Override
    public boolean push(E element) {
        if (size < arr.length) {
            arr[size++] = element;
            return true;
        }
        return false;
    }

    @Nullable
    @Override
    public E pop() {
        if (size > 0) {
            return arr[--size];
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < size; i++) {
            if (i + 1 < size) {
                builder.append(arr[i] + ", ");
            } else {
                builder.append(arr[i]);
            }
        }
        builder.append("]");
        return builder.toString();
    }

    @Override
    public boolean contains(E elem) {
        for (E element : arr) {
            if (elem == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E elem) {
        for (int i = 0; i < size; i++) {
            if (elem == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        if (size > 0) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }


}
