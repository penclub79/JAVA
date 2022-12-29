package shoppingMallObject;

public class ShoppingMallMain {

    public static void main(String[] args) {

        CustomInfo hocheol = new CustomInfo();

        hocheol.orderNum = 2019084341;
        hocheol.orderID = "penclyv";
        hocheol.orderDate = "2022년 12월 30일";
        hocheol.orderName = "신호순";
        hocheol.productNum = "pd-123";
        hocheol.orderAddress = "서울시 관악구";

        hocheol.showInfo();
    }
}
