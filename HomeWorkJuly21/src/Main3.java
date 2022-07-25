import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        //Создать мапу <String, Integer>. Удалить из мапы все записи с нечетными значениями
        HashMap<String, Integer> mapJ = new HashMap<>();
        mapJ.put("first", 22);
        mapJ.put("second", 7);
        mapJ.put("third", 9);
        mapJ.put("fourth", 13);
        mapJ.put("fifth", 17);
        mapJ.put("sixth", 8);
        mapJ.put("seventh", 10);
        mapJ.put("eightth", 98);
        mapJ.put("ninth", 160);

        System.out.println(mapJ);
        System.out.println(mapJ.get("second"));

        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : mapJ.entrySet()) {
            // System.out.println(entry.getKey());

            if (entry.getValue() % 2 == 0) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println(result);
    }
}