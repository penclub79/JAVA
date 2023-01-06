package Interface;

// 부분적으로 구현한다면 abstract 키워드가 필요하다.
public abstract class Calculator implements Calc{

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}

// 모두 구현한다면 abstract 키워드가 필요없다.
//public class Calculator implements Calc{
//
//    @Override
//    public int add(int num1, int num2) {
//        return 0;
//    }
//
//    @Override
//    public int substract(int num1, int num2) {
//        return 0;
//    }
//
//    @Override
//    public int times(int num1, int num2) {
//        return 0;
//    }
//
//    @Override
//    public int divide(int num1, int num2) {
//        return 0;
//    }
//}