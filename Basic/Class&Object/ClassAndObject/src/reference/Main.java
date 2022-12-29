package reference;

public class Main {

    public static void main(String[] args) {

        Student Lee = new Student(123, "Lee");
        Lee.setSubject("영어", 90);
        Lee.showInfo();
        Lee.setSubject("수학", 100);
        Lee.showInfo();
    }
}
