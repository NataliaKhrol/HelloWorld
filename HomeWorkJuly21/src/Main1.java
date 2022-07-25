import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        // Это задание мы с вами делали вместе на занятии
        Map<String, String> map = new HashMap<>();
        //Создать объект HashMap. Ключ - значение имеют типы String, String. В мапу необходимо поместить значения:
        //В качестве ключа - Автор (какая-то фамилия)
        //Значение - какой-то текст автора.
        //Найти самое популярное слово каждого автора и вывести информацию
        //"У автора (фамилия) самое популярное слово (слово)"
        map.put("Richard Bach", "р, в, п, р");
        map.put("Pushkin", "м, м, м, р");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Автор - " + entry.getKey());
            String[] words = entry.getValue().split(" ");
            String mostPopularWords = words[0];
            int lastCounter = 1;
            for (int i = 0; i < words.length; i++) {
                int count = 1;
                for (int j = i + 1; j < words.length - 1; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                    }
                }
                if (count > lastCounter) {
                    mostPopularWords = words[i];
                }
            }
            System.out.println(mostPopularWords);
        }
    }
}










