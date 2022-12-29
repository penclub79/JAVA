package shoppingMallObject;

public class CustomInfo {
    // 주문 번호
    public int orderNum;
    // 주문자 아이디
    public String orderID;
    // 주문 날짜
    public String orderDate;
    // 주문자 이름
    public String orderName;
    // 주문 상품 번호
    public String productNum;
    // 배송 주소
    public String orderAddress;

    public void showInfo() {
        System.out.println("주문 번호 : " + orderNum);
        System.out.println("주문자 아이디 : " + orderID);
        System.out.println("주문 날짜 : " + orderDate);
        System.out.println("주문자 이름 : " + orderName);
        System.out.println("주문 상품 번호 : " + productNum);
        System.out.println("배송 주소 : " + orderAddress);
    }
}
