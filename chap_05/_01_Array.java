package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열

        //배열 선언 첫번째 방법
        //String[] coffees = new String[4];

        //두번째 방법
        // String coffees[] = new String[4];
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        //세번째 방법;
        // String[] coffees = new String[] { "아메리카노", "카페모카", "라떼", "카푸치노" };

        //네번째 방법
        String[] coffees = { "아메리카노", "카페모카", "라떼", "카푸치노" };

        //커피 주문
        System.out.println(coffees[0] + " 하나");
        System.out.println(coffees[1] + " 하나");
        coffees[2] = "에스프레소"; // 변경
        System.out.println(coffees[2] + " 하나");
        System.out.println(coffees[3] + " 하나");





    }
}
