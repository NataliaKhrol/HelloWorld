import java.util.List;

public class Student {
    private int age;
    private String name;
    private List<Integer> markList;

    public Student(int age, String name, List<Integer> markList) {
        this.age = age;
        this.name = name;
        this.markList = markList;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getMarkList() {
        return markList;
    }

    public void setMarkList(List<Integer> markList) {
        this.markList = markList;
    }

    public void printInfoStudent() {
        System.out.println("Имя: " + name + " Возраст: " + age + " Список отметок: " + markList);

    }
}


