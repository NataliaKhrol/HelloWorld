import java.util.Arrays;

public class HomeWorkLength {
    //�������� �����, ������� ������� � ������� ��� �����, ����� ������� �� 3 �� 5 ������������.
    public static void main(String[] args) {
        String j = "I like Java";
        String[] words = j.split(" ");
        // System.out.println(Arrays.toString(words));

        int count = 0;
        for (int m = 0; m < words.length; m++) {
            String word = words[m];
            //  String[] wordIntoLetters = word.split("");
            //System.out.println(Arrays.toString(wordIntoLetters));

            if (word.length() >= 3 && word.length() <= 5) {
                count += 1;
            } else {
                continue;
            }
            System.out.println(word);
        }
        System.out.println("� ������ ���� " + count + "�����, ����� ������� �� 3-5 ����.");
    }
}

