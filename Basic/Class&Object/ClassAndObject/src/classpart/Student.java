package classpart;

/*
* public class는 파일 이름과 동일해야하며 이 파일안에 하나만 존재할 수 있다.
* 다른 class는 이름을 아무렇게 써서 사용할 수 있다.
* 예를들어 이렇게
* class AA {}
* class BB {}
* class CC {}
* */

public class Student
{
    // 학생ID
    // 이름
    // 주소
    // int studentID;
    // String studentName;
    // String address; <- 이렇게 사용할 수 있지만 [접근제어자]를 적용해서 변수를 만들자.


    public Student(int id, String name) // 생성자를 이용한 변수 초기화
    {
        studentID = id;
        studentName = name;
    }

    public Student(int id, String name, String address) // 생성자 오버로딩
    {
        studentID = id;
        studentName = name;
        studendAddress = address;
    }

    // public이라는 접근제어자를 적용한 변수 선언이다.
    public int studentID;
    public String studentName;
    public String studendAddress;


    // 학생의 정보를 보여주는 것은 메소드로 구현한다.
    public void showStudentInfo()
    {
        System.out.println(studentName + "," + studendAddress);
    }

    public String getStudentName()
    {
        return studentName;
    }

}
