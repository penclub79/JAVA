package classpart;

public class StudentMain
{
    public static void main(String[] args) {
//        Student studentLee = new Student(); // 기본 생성자 -> 메모리에 생성된다.
        Student studentLee = new Student(123, "이순신"); // 기본 생성자 -> 메모리에 생성된다.
//        studentLee.studentName = "이순신";
//        studentLee.address = "서울";
        Student studentKim = new Student(321, "김유신", "관악구");

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();
    }
//    public static void main(String[] args)
//    {
//        System.out.println("");
//    }
}
