import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Map<String, List<Integer>> map1 = new HashMap<>();

        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(5);
        s.add(13);
        s.add(13);
        s.add(14);
        s.add(14);
        s.add(14);
        map1.put("first", s);

        s = new ArrayList<>();
        s.add(1);
        s.add(5);
        s.add(22);
        s.add(132);
        s.add(22);
        s.add(22);
        s.add(22);
        map1.put("second", s);

        System.out.println(map1);

        for (Map.Entry<String, List<Integer>> he : map1.entrySet()) {
            Map<Integer, Integer> result = countDuplicates(he.getValue());
            System.out.println(he.getKey() + ": " + result);
        }
    }
    private static Map<Integer, Integer> countDuplicates(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : numbers) {
            int counter = 0;
            for (Integer number2 : numbers) {

                if (number.equals(number2)) {
                    counter += 1;
                }
            }
            if (counter > 1) {
                map.put(number, counter);
            }
        }
        return map;
    }
}