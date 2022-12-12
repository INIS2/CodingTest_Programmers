// ReverseNumberArray // 아직
// https://school.programmers.co.kr/learn/courses/30/lessons/12932
package Lv1;

public class ReverseNumberArray {
    public static void main(String[] args) {
        int[] answer = {};
        int cnt = 0;
        int n = 12345;
        while (n>0) {
            answer[cnt] = n % 10;
            cnt += 1;
            n /= 10;
            System.out.println(cnt + ", " + n);
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    } // main
} // class

// 배워가는 사이트