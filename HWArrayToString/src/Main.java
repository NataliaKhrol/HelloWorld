import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        List<Integer> markList = new ArrayList<>();
        markList.add(5);
        markList.add(5);
        markList.add(7);
        markList.add(7);
        Student student1 = new Student(23, "Maxim", markList);
        student1.printInfoStudent();
        Integer sum = 0;
        for (Integer i : markList) {
            sum += i;

        }
        count += sum;
        System.out.println("Îáùèé áàëë - " + sum);


        List<Integer> markList2 = new ArrayList<>();
        markList2.add(7);
        markList2.add(8);
        markList2.add(9);
        markList2.add(10);
        Student student2 = new Student(32, "Mania", markList2);
        student2.printInfoStudent();
        Integer sum2 = 0;
        for (Integer i : markList2) {
            sum2 += i;

        }
        count += sum2;
        System.out.println("Îáùèé áàëë - " + sum2);

        List<Integer> marklist3 = new ArrayList<>();
        marklist3.add(9);
        marklist3.add(9);
        marklist3.add(10);
        marklist3.add(10);
        Student student3 = new Student(38, "Sean", marklist3);
        student3.printInfoStudent();
        Integer sum3 = 0;
        for (Integer i : marklist3) {
            sum3 += i;

        }
        count += sum3;
        System.out.println("Îáùèé áàëë - " + sum3);

        List<String> studentList = new ArrayList<>();
        studentList.add(String.valueOf(student1.getName()));
        studentList.add(String.valueOf(student2.getName()));
        studentList.add(String.valueOf(student3.getName()));
        //  System.out.println(studentList.size());
        int rating = count / studentList.size();
        //System.out.println(rating);

        University university = new University("Harvard", studentList, rating);
        university.printInfoUniversity();

    }
}



