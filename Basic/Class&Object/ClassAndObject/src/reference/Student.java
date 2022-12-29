package reference;

public class Student
{
    int studentID;
    String studentName;
    Subject subject; // 참조 자료형 변수 선언
//    Subject math;

    public Student(int id, String name) // 생성자 초기화
    {
        studentID = id;
        studentName = name;

        subject = new Subject(); // 참조 자료형 생성
    }

    public void setSubject(String subjectName, int score)
    {
        subject.setSubjectName(subjectName, score);
    }

    public void showInfo()
    {
        System.out.println("학생의 이름은 : " + studentName);
        System.out.println("과목 : " + subject.subjectName);
        System.out.println("점수 : " + subject.score);
    }


}
