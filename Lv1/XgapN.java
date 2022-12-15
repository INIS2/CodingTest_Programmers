// x만큼 간격이 있는 n개의 숫자  //finish
// https://school.programmers.co.kr/learn/courses/30/lessons/12954
package Lv1;

import java.util.Scanner;

public class XgapN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("기본값 x를 넣으시오");
        long x1 = (long)scan.nextInt();
        long x2 = x1;
        //int x = -2;
        System.out.println("간격수 n를 넣으시오");
        int n = scan.nextInt();
        //int n = 2;
        
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = x2;
            x2 = x2 + x1;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        scan.close();

    } // main
} // class

// 배워가는 사이트
// 스캐너 써봤다 https://sayit.tistory.com/entry/java-Scanner