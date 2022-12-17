// 하샤드 수 // 완성 노노
// https://school.programmers.co.kr/learn/courses/30/lessons/12947
package Lv1;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("int x 입력 >> ");
       int x = scan.nextInt();
       int sum = 0;
        for (int i = 0; i < (int)(Math.log10(x)+1); i++) {
            sum = sum + (x % 1);
            System.out.println(sum);
            x = x % 1 ;
            System.out.println(x);
        }

       scan.close();
    } // main
} // class

// 배워가는 사이트
