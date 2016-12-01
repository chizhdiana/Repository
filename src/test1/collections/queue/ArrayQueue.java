package test1.collections.queue;

/**
 * Created by acer on 20.09.2016.
 */
public class ArrayQueue <E> implements Queue<E> {
    private E[] arr;
    private int size;
    // private  int first;
    // private int last;
    // private int nElem;


    public ArrayQueue() {
        //this.size=size;
        size=0;
        arr = (E[]) new Object[8];
        //first = 0;
        //last= 0;
        // nElem =0;
    }
    // @Override
    public boolean offer(E element) {
        if (size < arr.length) {
            arr[size++] = element;

            return true;
        }
        return false;
    }

    // @Override
    public E poll() {
        E elem = arr[0];//
        shiftToLeft(arr);
        size--;
        return elem;
    }

    // @Override
    public boolean contains(E elem) {
        for(E element:arr){
            if(elem==element){
                return true;
            }
        }
        return false;
    }

    //@Override
    public int indexOf(E elem) {
        for(int i =0; i<arr.length;i++){
            if(elem==arr[i]){
                return i;
            }
        }

        return -1;
    }

    // @Override
    public void clear() {
        size =0;

    }

    // @Override
    public boolean isEmpty() {
        if(size==0){
            return true;
        }

        return false;
    }

    // @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < size) {
                builder.append(arr[i] + ",");

            } else {
                builder.append(arr[i]);
            }
        }
        builder.append("]");
        return builder.toString();

    }


    private void shiftToRight(E[] arr) {
        System.arraycopy(arr, 0, arr, 1, size);
    }

    private void shiftToLeft(E[] arr) {
        System.arraycopy(arr, 1, arr, 0, size);
    }
}
