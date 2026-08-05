import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class CollectionFramework {
    static void main() {
//        List orr Collection -> Interface hai

//        ArrayList -> concrete class hai
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//
//        System.out.println(list);
//
//        list.remove(0);
//
//        System.out.println(list);
//
//
//
//        List<Integer> list2 = new ArrayList<>();
//
//        list2.add(101);
//        list2.add(105);
//        list.addAll(list2);
//        System.out.println(list);
//
//        list.removeAll(list2);
//        System.out.println(list);
//        System.out.println(list.size());
//
//        // I want to traverse list using iterator
//
//        Iterator<Integer> iterator = list.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println("element " +iterator.next());
//        }
//
//        List<Integer> col = new ArrayList<>();
//
//        col.add(10);
//        col.add(20);
//        col.add(30);
//        System.out.println(col.get(0));
//        System.out.println("before set :" + col);
//        col.set(2,200);
//        System.out.println("after set :" +col);
//
//
//        //toArray
//        Object [] arr = col.toArray();
//        for(Object obj: arr) {
//            System.out.println(obj);
//        }
//
//        //contains
//        System.out.println(col.contains(10));
//        System.out.println(list.contains(1000));



        //Practice collection (list) method

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(100);
        list2.add(200);

        list1.addAll(list2);

        System.out.println(list1);

        System.out.println(list1.get(2));

        Iterator<Integer> iterator = list1.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());

            list1.set(0,500);
            System.out.println(list1);

            list1.remove(0);
            System.out.println(list1);
//            list1.removeAll();
//            System.out.println(list1);

            list1.clear();
            System.out.println(list1);
            System.out.println(list2.size());

            //toArray

            Object [] arr = list2.toArray();
            for(Object obj:arr ){
                System.out.println(obj);

                System.out.println(list2.contains(10));
            }
        }
    }
}
