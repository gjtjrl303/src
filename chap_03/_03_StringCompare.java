package chap_03;

public class _03_StringCompare{
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("s2")); // 문자열 내용이 같으면 true 다르면 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분없이 문자열 내용 같은지

        //문자열 비교 심화
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); //내용 비교
        System.out.println(s1 == s2); // 참조 비교

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); // false


    }
}
