import java.util.Arrays;

public class HomeWorkLongWord {
    public static void main(String[] args) {
        //�������� �����, ������� ���������� ����� ������� ����� � ������.
        String j = "beautiful things like beautiful things are the privilidge of the rich";
        String[] words = j.split(" ");
        System.out.println(Arrays.toString(words));

        String result = words[0];
        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];

            if (result.length() < currentWord.length()) {
                result = currentWord;
            }
        }
        System.out.println("����� ������� ����� � ������ " + result);
    }
}


