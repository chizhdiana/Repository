package test1.collections.queue;

/**
 * Created by diana on 10.11.16.
 */


public class LinkedQueue<E> implements Queue<E> {

    private class Node {
        public E element;
        public Node next;

        public Node(E element) {
            this.element = element;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedQueue() {
        size = 0;
    }

    @Override
    public boolean offer(E element) {
        Node nd = new Node(element);
        if (head == null) {
            head= tail = nd;
        } else {
            tail.next = nd;
            tail = nd;
        }
        size++;
        return true;
    }

    @Override
    public E poll() {
        E element = head.element;
        head = head.next;
        size--;
        return element;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("HEAD -> {" + head.element + "} [");
        Node start = head;
        while (start != null) {
            if (start.next != null) {
                builder.append(start.element + ", ");
            } else {
                builder.append(start.element);
            }
            start = start.next;
        }
        builder.append("] {" + tail.element + "} <- TAIL");
        return builder.toString();
    }

    @Override
    public boolean contains(E elem) {
        Node start = head;
        while (start.element != elem) {
            if(start.next==null){
                return false;
            }
            else{
                start = start.next;
            }
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
        head = tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head != null ? true : false;
    }

    @Override
    public int size() {
        return size;
    }


}

