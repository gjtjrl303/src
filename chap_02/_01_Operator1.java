package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자

        //일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);
        System.out.println(2 / 4);
        System.out.println(4 % 2);
        System.out.println(5 % 2);

        //우선 순위 연산
        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);

        //변수 이용 연산
        int a = 20;
        int b = 10;

        int c;
        c = a + b;
        System.out.println(c);

        c=a-b;
        System.out.println(c);

        c=a*b;
        System.out.println(c);

        //증감 연산

    }
}
