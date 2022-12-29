package hiding;

public class MyDate {
    private int day;
    private int month;
    private int year;

    // private 접근 제어자의 변수를 가져다 쓰고 싶다면~
    // public 함수를 이용한다.
    public void setDay(int day)
    {
        this.day = day;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public void showInfo()
    {
        System.out.println(year+"년"+month+"월"+day+"일");
    }


}
