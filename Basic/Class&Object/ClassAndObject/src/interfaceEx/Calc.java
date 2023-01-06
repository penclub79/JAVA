package Interface;

public interface Calc {

    double PI = 3.14;
    int ERROR = -999999;

    // 어떤 기능들을 쓸지 선언만 한다.
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    // 위 기능을 구체적인 로직으로 구현한다.
}
