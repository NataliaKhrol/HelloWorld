import java.util.List;

public class University {
    private String title;
    private List<String> studentList;
    private int rating;

    public University(String title, List<String> studentList, int rating) {
        this.title = title;
        this.studentList = studentList;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getStudentList() {
        return studentList;
    }

    public int getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStudentList(List<String> studentList) {
        this.studentList = studentList;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void printInfoUniversity() {
        System.out.println("Название Университете: " + title + " Список студентов: " + studentList + " Рейтинг Университета: " + rating);
    }
}
