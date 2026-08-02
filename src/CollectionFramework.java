import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class CollectionFramework {
    static void main() {
        //List orr Collection -> Interface hai

        //ArrayList -> concrete class hai
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        list.remove(0);

        System.out.println(list);



        List<Integer> list2 = new ArrayList<>();

        list2.add(101);
        list2.add(105);
        list.addAll(list2);
        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list.size());

        // I want to traverse list using iterator

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println("element " +iterator.next());
        }

//        Collection<Integer> new ArrayList<>();

    }
}
