package test1.collections.set;

/**
 * Created by diana on 10.11.16.
 */


public class TreeSet <E extends Comparable> implements Set <E>{

    private class Node<E>{
        private  E element;
        private Node<E> parent;
        private Node<E> leftChild;
        private Node<E> RightChild;

        public Node(E element) {
            this.element = element;

        }
    }

    private Node <E> head;

    @Override
    public boolean add(E element) {
        return false;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public boolean remove(E element) {
        return false;
    }

}
