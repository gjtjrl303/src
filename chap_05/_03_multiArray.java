package chap_05;

import java.sql.SQLOutput;

public class _03_multiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)

        //소규모 영화관 좌석

        String[] seatA = {"A1","A2","A3","A4","A5"};
        String[] seatB = {"B1","B2","B3","B4","B5"};
        String[] seatC = {"C1","C2","C3","C4","C5"};

        // 3 x 5 크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };

        //B2에 접근하려면?
        System.out.println(seats[1][1]);
        System.out.println(seats[2][4]);

        //앞줄 3칸 둘째 4칸 셋째 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        // A3에 접근하려면
        System.out.println(seats2[0][2]);

        // 3차원 배열
        String[][][] marray = new String[][][]{
                {{}, {}, {},},
                {{}, {}, {},},
                {{}, {}, {},}
        };
    }
}
