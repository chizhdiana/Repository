package test1.collections.stack;

/**
 * Created by diana on 10.11.16.
 */

public class LinkedStack<E> implements Stack<E> {

    private class Node {
        public E element;
        public Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    private Node head;
    private int size;

    public LinkedStack() {
        this.size = 0;
    }

    @Override
    public boolean push(E element) {
        head = new Node(element, head);
        size++;
        return true;
    }

    @Override
    public E pop() {
        E element = head.element;
        head = head.next;
        size--;
        return element;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Node start = head;
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

    @Override
    public boolean contains(E elem) {
        Node start = head;
        while (start != null) {
            if (start.element == elem) {
                return true;
            }
            start = start.next;
        }
        return false;
    }

    @Override
    public int indexOf(E elem) {
        Node start = head; int count = 0;
        while (start != null) {
            if (start.element == elem) {
                return count;
            }
            count++;
            start = start.next;
        }
        return -1;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        if (head != null) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

}

