import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        // ��� ������� �� � ���� ������ ������ �� �������
        Map<String, String> map = new HashMap<>();
        //������� ������ HashMap. ���� - �������� ����� ���� String, String. � ���� ���������� ��������� ��������:
        //� �������� ����� - ����� (�����-�� �������)
        //�������� - �����-�� ����� ������.
        //����� ����� ���������� ����� ������� ������ � ������� ����������
        //"� ������ (�������) ����� ���������� ����� (�����)"
        map.put("Richard Bach", "�, �, �, �");
        map.put("Pushkin", "�, �, �, �");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("����� - " + entry.getKey());
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










