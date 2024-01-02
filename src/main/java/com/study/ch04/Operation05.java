package com.study.ch04;

public class Operation05 {
    public static void main(String[] args) {
        /*
         << 문제 >>

         int x = 1;
         int y = 1;

         x와 y중 하나라도 값이 0이면 결과는 "오류"
         사분면을 삼항연산자로 출력
         x 양수이면서 y양수이면 => 1사분면
         x 음수이면서 y양수이면 => 2사분면
         x 양수이면서 y음수이면 => 3사분면
         x 음수이면서 y음수이면 => 4사분면
         */

        int x = -1;
        int y = -5;

        String result = x * y == 0 ? "오류"
                : x > 0 && y > 0 ? "1사분면"
                : x < 0 && y > 0 ? "2사분면"
                : x > 0 && y < 0 ? "4사분면"
                : "3사분면";

        String result2 = x * y == 0 ? "오류"
                : x > 0 ? (y > 0 ? "1사분면" : "4사분면")
                : y > 0 ? "2사분면" : "3사분면";

        System.out.println(result);
        System.out.println(result2);

    }

}
