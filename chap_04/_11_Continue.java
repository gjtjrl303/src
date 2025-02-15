package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // continue
        //노쇼 치킨 손님
        int max = 20; // 최대 치킨 손님
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 17번 손님 노쇼
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i + "번 손님 치킨 나옴");

            // 손님이 없다면
            if(i == noShow){
                System.out.println(i + "번 손님 기회 넘어감");
                continue;
            }
            sold ++;
            if (sold == max){
                System.out.println("재료 모두 소진");
                System.out.println("영업 종료");
                break;
            }
        }
        System.out.println("--------------------");
        // while 문
        int index = 0;
        sold = 0;
        while(index <=50){
            index++;
            System.out.println(index + "번 손님 치킨 나옴");
            if(index == 17){
                System.out.println(index +"번 손님 기회 넘어감");
                continue;
            }
            sold ++;
            if(sold == 20){
                System.out.println("재료 모두 소진");
                break;
            }
        }
        System.out.println("영업을 종료합니다");
    }
}
