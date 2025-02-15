package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10; //주차시간
        int fee = 0; //가격
        boolean smallCar = true; //경차 여부
        boolean disabled = true; //장애인 여부
        for (int i = 1; i <= hour; i++) {
            fee += 4000;
            if(fee>30000){
                fee =30000;
                break;
            }
        }
        if(smallCar || disabled){
            fee *= 0.5f;
        }
        System.out.println("주차 요금 : "+ fee);
    }
}
