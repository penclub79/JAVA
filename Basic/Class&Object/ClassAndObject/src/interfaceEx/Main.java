package Interface;

public class Main {
    public static void main(String[] args) {

        // CompleteCalc에서 나머지 추상 메서드를 구현했기 때문에 추상 메서드를 모두 사용할 수 있다.
        CompleteCalc calc = new CompleteCalc();

        // showInfo()가 없는 Calc 클래스
        Calc calc1 = new CompleteCalc();

        int n1 = 10;
        int n2 = 2;

        // Calculator, CompleteCalc 클래스에서 오버라이드한 추상 메서드 호출
        System.out.println(calc.add(n1, n2));
        System.out.println(calc.substract(n1, n2));
        System.out.println(calc.times(n1, n2));
        System.out.println(calc.divide(n1, n2));
        calc.showInfo();

        // Calc 클래스에 선언된 오버라이드된 추상 메서드 호출
        System.out.println(calc1.add(n1, n2));
        System.out.println(calc1.substract(n1, n2));
        System.out.println(calc1.times(n1, n2));
        System.out.println(calc1.divide(n1, n2));
        // calc1.showInfo(); ERROR
    }
}
