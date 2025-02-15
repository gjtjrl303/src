package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드 필요 이유

        System.out.println(getPower(2,2));

        System.out.println(getPower(2,3));

        System.out.println(getPower(2,4));
    }
}
