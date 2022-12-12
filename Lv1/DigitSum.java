// 자릿수 더하기 //Finish
// https://school.programmers.co.kr/learn/courses/30/lessons/12931
package Lv1;

public class DigitSum {
    public static void main(String[] args) {
        int answer=0;
        int n = 1234;

        while (n>0) {
            answer = answer + (n % 10);
            n = n / 10;
        }   
        System.out.println(answer);

    } // main
} // class

// 배워가는 사이트