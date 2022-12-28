package classpart;

public class StudentMain
{
    public static void main(String[] args) {
        Student studentLee = new Student(); // 생성자 -> 메모리에 생성된다.
        studentLee.studentName = "이순신";
        studentLee.address = "서울";

        studentLee.showStudentInfo();
    }
//    public static void main(String[] args)
//    {
//        System.out.println("");
//    }
}
