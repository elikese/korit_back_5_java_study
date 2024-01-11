package com.study.ch15;

import java.util.Arrays;

/*
 * 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
 * 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
 * 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
 * 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
 * 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
 * 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
 * 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 */
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int count = 0;
        int[] diceArray = {a,b,c,d};
        int[] countArray = new int[4];
        // 4 4 4 4
        // 3 3 3 1 a가 중복값일때 같은값p 다른값q
        // 2 2 2 2 a와 같은값p 다른값q
        // 1 1 1 1 최솟값

        for (int i = 0; i < diceArray.length; i++) {
            for (int j = 1; j < diceArray.length ; j++) {
                if (diceArray[i] == diceArray[j]) {

                }
            }
            countArray[i] = count;
        }
        for (int i = 0; i < countArray.length ; i++) {
            if(countArray[i] == 4) {
                answer = diceArray[0]*1111;
            } else if (countArray[i] == 3) {

            } else if (countArray[i] == 2) {

            } else if (countArray[i] == 1) {

            }


        }



        return answer;
    }
}
