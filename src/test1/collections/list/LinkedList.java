package test1.collections.list;

import test1.collections.Collection;

/**
 * Created by nucleos on 25.09.16.
 */

public class LinkedList<E> implements List<E> {

    private Node<E> first;
    private Node<E> last;

    private int size;

    private class Node<E> {

        private E element;
        private Node<E> next;
        private Node<E> prev;

        public Node(E element) {
            this.element = element;
        }
    }

    public LinkedList() {
        size = 0;
    }

    @Override
    public void add(E element) {
        Node nd = new Node(element);
        if (first == null) {
            first = last = nd;
        } else {
            nd.prev   = last;
            last.next = nd;
            last      = nd;
        }
        size++;
    }

    @Override
    public void add(int index, E element) {
        checkIndex(index);
        Node<E> nd = new Node(element);

        Node current = findPosition(index ,checkHalf(index));
        nd.prev = current.prev;
        current.prev.next = nd;
        nd.next = current;
        current.prev = nd;
        size++;
    }

    @Override
    public void addAll(Collection<? extends E> collection) {

    }

    @Override
    public void addAll(int index, Collection<? extends E> collection) {

    }

    @Override
    public E get(int index) {
        checkIndex(index);
        Node<E> current = findPosition(index, checkHalf(index));
        return current.element;
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        Node<E> current = findPosition(index, checkHalf(index));
        E old = current.element;
        current.element = element;
        return old;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        Node<E> current = findPosition(index, checkHalf(index));
        if (current == first) {
            first = current.next;
            current.next.prev = null;
        } else if (current == last) {
            last = current.prev;
            current.prev.next = null;
        } else {
            current.next.prev = current.prev;
            current.prev.next = current.next;
            current.next = current.prev = null;
        }
        size--;
        return current.element;
    }

    @Override
    public List<E> subList(int indexFrom, int indexTo) {
        return null;
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
        first = last = null;
    }

    @Override
    public boolean isEmpty() {
        return first == null ? true : false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Node start = first;
        while (start != null) {
            if (start.next != null) {
                builder.append(start.element + ", ");
            } else {
                builder.append(start.element);
            }
            start = start.next;
        }
        builder.append("]");
        return builder.toString();
    }

    private boolean checkIndex(int idx) {
        if (idx < 0 | idx >= size) {
            throw new IndexOutOfBoundsException();
        }
        return true;
    }

    private Node checkHalf(int idx) {
        if (idx < (size / 2)) {
            return first;
        }
        return last;
    }

    private Node<E> findPosition(int index, Node start) {
        int counter;
        if (start == first) {
            counter = 0;
            while (counter < index) {
                start = start.next;
                counter++;
            }
            return start;
        } else {
            counter = size - 1;
            while (counter > index) {
                start = start.prev;
                counter--;
            }
            return start;
        }
    }
}
