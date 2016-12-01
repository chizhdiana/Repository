package test1.collections.queue;

/**
 * Created by diana on 10.11.16.
 */


public class CirclQueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new CirclQueue<>(5);
        System.out.println(queue.offer(1));
        System.out.println(queue.offer(2));
        System.out.println(queue.offer(3));
        System.out.println(queue.offer(4));
        System.out.println(queue.offer(5));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.offer(6));
        System.out.println(queue);
        System.out.println(queue.offer(10));
        System.out.println(queue.offer(11));
        System.out.println(queue.offer(12));
        System.out.println(queue);

        System.out.println("Индекс 10-го элемента:"+ queue.indexOf(10));
        System.out.println("Индекс 7-го элемента:"+ queue.indexOf(7));

        System.out.println("Проверить наличие елемнта 13:"+ queue.contains(13));
        System.out.println("Проверить наличие елемнта 6:"+ queue.contains(6));

        // System.out.println(queue.peek());


    }
}
