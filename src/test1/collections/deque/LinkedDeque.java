package test1.collections.deque;


/**
 * Created by acer on 20.09.2016.
 */
public class LinkedDeque<E> implements Deque<E> {

    private class  Node{
        public E element;
        public Node next;
        public Node previous;

        public Node(E element) {
            this.element = element;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedDeque() {
        size = 0;
    }

    // @Override
    public void addFirst(E element) {
        Node nd = new Node(element);
        if(isEmpty()){
            tail=nd; // если список не содержит елементов
        }
        else{
            head.previous = nd;
            nd.next = head;
            head = nd ;
        }
    }
    // @Override
    public void addLast(E element) {
        Node nd = new Node(element);
        if(isEmpty()){
            head =nd; // если список не содержит елементов
        }
        else{
            tail.next = nd;
            nd.previous = tail;
            tail = nd;
        }
    }

    // @Override
    public boolean offerFirst(E element) {
        Node nd = new Node(element);
        if (head == null) {
            head = tail = nd;
        }
        else{
            head.previous = nd;
            nd.next = head;
            head = nd ;
        }
        size++;
        return true;
    }

    // @Override
    public boolean offerLast(E element) {
        Node nd = new Node(element);
        if (tail == null) {
            tail = head = nd;
        }
        else{
            tail.next = nd;
            nd.previous = tail;
            tail = nd;
        }
        size++;
        return true;
    }

    //  @Override
    public E peekFirst(){
        if(head.element==null){
            return null;}
        else{
            return head.element;
        }

    }

    //  @Override
    public E peekLast() {

        if(tail.element == null){
            return null;
        }
        return tail.element;
    }

    //  @Override
    public E pollFirst() {
        E element = head.element;
        if(head.next == null){ // если элемент один
            tail=null;
        }
        else{
            head.next.previous = null;
            head = head.next;

            // return element;
        }
        --size;
        return element;
    }

    //  @Override
    public E pollLast() {
        E element = tail.element;
        if(head.next == null){
            head =null;
        }
        else {
            tail.previous.next = null;
            tail = tail.previous;
        }
        size--;
        return element;
    }
    //  @Override
    public boolean contains(E elem) {
        Node start =head;
        while(start!=elem){
            if(start.next==null){
                return false;
            }
            else{
                start=start.next;
            }
            if(start.element == elem){
                return true;
            }}
        //start = start.next;
        // }

        return false;
    }

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

    // @Override
    public void clear() {
        size=0;

    }

    //  @Override
    public boolean isEmpty() {
        return head==null? true:false;

    }

    //  @Override
    public int size() {
        return size;
    }

    // @Override
    public boolean push(E element) {
        return false;
    }

    // @Override
    public E pop() {
        return null;
    }

    //  @Override
    public boolean offer(E element) {
        return false;
    }

    // @Override
    public E peek() {
        return null;
    }

    // @Override
    public E poll() {
        return null;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(" [");
        Node start = head;
        while (start != null) {
            if (start.next != null) {
                builder.append(start.element + ", ");
            } else {
                builder.append(start.element);
            }
            start = start.next;
        }
        builder.append("] ");
        return builder.toString();
    }

}
