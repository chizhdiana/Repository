package test1.collections.queue;

/**
 * Created by diana on 10.11.16.
 */

public class CirclQueue<E> implements Queue<E> {
    private E array[];
    private int size;
    private int head;
    private int tail;
    private int nElem;


    public CirclQueue( int size) {

        array = (E[]) new Object[size];
        this.size = size;
        head = 0;
        tail = -1;
        nElem=0;
    }

    @Override
    public boolean offer(E element) { // добавляем елемент в хвост
        array[++tail]= element; // идет добавление елемента
        nElem++; // величиваем количество елементов
        if(tail==size-1) { // если последний елемент , хвост опускается до ниже головы
            tail = -1;
        }
        return true;
        //return false;
    }

    @Override
    public E poll() {
        E tmp = array[head++]; // Получаем первый елемент
        if(head==size){ // циклический процесс
            head=0;
        }
        nElem--;
        return tmp;
    }
    @Override
    public boolean contains(E elem) {
        for(E element:array){
            if(elem==element){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E elem) {
        for(int i=0; i<size;i++){
            if(elem==array[i]){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        size=0;{
        }
    }

    @Override
    public boolean isEmpty() {
        if(head==tail){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    public E peek(){
        return array[head];
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(int i=0; i<array.length; i++){
            if(i+1<size){
                builder.append(array[i]+ ",");
            }
            else{
                builder.append(array[i]);
            }
        }
        builder.append("]");
        return builder.toString();
    }


}
