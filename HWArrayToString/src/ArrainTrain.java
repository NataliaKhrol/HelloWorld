import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrainTrain {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("156");
        list.add("первый пошел");
        list.add("Keep on swimming, Doretty");
        System.out.println(list);
        System.out.println(list.size());

        List<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(123);
        list1.add(5789);
        System.out.println(list1);
        System.out.println(list1.get(0));
        System.out.println(list1.contains(5789));
        System.out.println(list1.remove(2));
        System.out.println(list1);
        System.out.println(list1.isEmpty());
        System.out.println(list1.size());
        System.out.println(list1.add(59999));
        System.out.println(list1);
        System.out.println("-----------------------");

        List<Integer> list2 = new LinkedList<>();
        list2.add(58);
        list2.add(78);
        list2.add(98);
        System.out.println(list2);
        System.out.println(list2.size());
        System.out.println(list2.isEmpty());
        System.out.println(list2.contains(45));
        System.out.println(list2.remove(0));
        list2.add(58);
        System.out.println(list2);
    }
}


