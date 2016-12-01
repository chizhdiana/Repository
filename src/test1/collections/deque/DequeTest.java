package test1.collections.deque;

/**
 * Created by diana on 10.11.16.
 */

public class DequeTest {
    public static void main(String[] args) {
        Deque <Integer> deque = new LinkedDeque<>();


        System.out.println(deque.offerFirst(1));
        System.out.println(deque.offerFirst(2));
        System.out.println(deque.offerFirst(3));
        System.out.println(deque.offerFirst(4));

        System.out.println(deque);
        System.out.println("Добавим в начало елемент 10:" );
        deque.addFirst(10);
        System.out.println(deque);
        System.out.println(deque.offerLast(9));
        System.out.println(deque.offerLast(11));
        System.out.println(deque.offerLast(12));
        System.out.println(deque);
        System.out.println("Добавим в конец следующие елементы:6,7,8,9,");

        deque.addLast(6);
        deque.addLast(7);
        deque.addLast(8);
        deque.addLast(9);
        System.out.println(deque);

        System.out.println("Выведем первый елемент:"+deque.peekFirst());
        System.out.println("Выведем последний елемент:"+deque.peekLast());


        System.out.println("Проверим список на наличие елемента 70:"+deque.contains(70));

        System.out.println( "Удалим первый елемент:"+ deque.pollFirst());
        System.out.println(deque);
        System.out.println( "Удалим последний елемент:"+deque.pollLast());




        System.out.println("Найдем индекс 8-го елемента:"+deque.indexOf(8));
        System.out.println(deque);
    }

}
