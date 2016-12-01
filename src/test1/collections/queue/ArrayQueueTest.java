package test1.collections.queue;

/**
 * Created by diana on 10.11.16.
 */

public class ArrayQueueTest {
    public static void main(String[] args) {


        Queue<Integer> queue = new ArrayQueue<>();

        System.out.println( queue.offer(1));
        System.out.println( queue.offer(2));
        System.out.println( queue.offer(3));
        System.out.println( queue.offer(4));
        // System.out.println( queue.offer(5));
        // System.out.println( queue.offer(6));
        // System.out.println( queue.offer(7));
        //System.out.println( queue.offer(8));
        //System.out.println( queue.offer(9));



        System.out.println( "IsEmpty:"+ queue.isEmpty());



        System.out.println(queue);

        System.out.println("Извлекли елемент:"+queue.poll());
        System.out.println("Извлекли елемент:"+queue.poll());
        System.out.println("Извлекли елемент:"+queue.poll());
        System.out.println("Извлекли елемент:"+queue.poll());


        System.out.println( "Положили елемент 9:"+queue.offer(9));
        System.out.println( "Положили елемент 10:"+queue.offer(10));
        System.out.println( "Положили елемент 11:"+queue.offer(11));
        System.out.println( "Положили елемент 12:"+queue.offer(12));
        System.out.println("Положили елемент 13:"+ queue.offer(13));
        System.out.println("Положили елемент 14:"+ queue.offer(14));
        System.out.println( "Положили елемент 15:"+ queue.offer(15));

        System.out.println(queue);

        System.out.println(queue.contains(2));
        System.out.println(queue.contains(8));
        System.out.println(queue.contains(8));


        System.out.println(queue.indexOf(0));
        System.out.println(queue.indexOf(3));



    }

}