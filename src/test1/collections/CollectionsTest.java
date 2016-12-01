package test1.collections;

import test1.collections.list.LinkedList;


/**
 * Created by diana on 10.11.16.
 */

public class CollectionsTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        list.add(2, 100);
        list.add(6, 200);

        System.out.println(list);

        System.out.println("ELEMENT 2 = " + list.get(2));
        System.out.println("ELEMENT 5 = " + list.get(5));
        System.out.println("ELEMENT 7 = " + list.get(7));

        System.out.println("RETURN OLD = " + list.set(5, 300));

        System.out.println(list);

        System.out.println(list.remove(0));
        System.out.println(list.remove(4));
        System.out.println(list.remove(8));

        System.out.println(list);

    }
}
