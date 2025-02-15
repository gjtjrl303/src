package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-2234567";
        System.out.println(id.substring(0, 8)); //0에서 8위치 직전까지
        System.out.println(id.substring(0, id.indexOf("-") + 2));

    }
}
