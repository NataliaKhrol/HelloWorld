import java.util.ArrayList;
import java.util.List;

public class SimpleResultHistory implements ResultOperationHistory {
    List<Integer> list = new ArrayList<Integer>(3);
  //  int freeIndex = 0; ��� �������� �� �������� �����������, �.�. � �������� ����.������ ������, a arraylist �������� ������ �� ���� �� �����

    @Override
    public void printHistory() {
       // for (int i = 0; i < list.size(); i++) {
        for (Integer e : list)
            System.out.println(e);
        }



    @Override
    public void addToHistory2(Integer e) {
        list.add(e);
    }
}

      //  if (freeIndex >= list.size()) {
        //    freeIndex = 0;
        //}
