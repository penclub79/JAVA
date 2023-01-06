package Interface;

// 나머지 추상 메서드를 구현하기 때문에 abstract 키워드가 필요 없다.
public class CompleteCalc extends Calculator{

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (0 == num2)
        {
            return ERROR;
        }
        else
            return num1 / num2;
    }

    public void showInfo()
    {
        System.out.println("모두 구현하였습니다.");
    }
}
