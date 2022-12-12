// 짝수와 홀수 // Finish
// https://school.programmers.co.kr/learn/courses/30/lessons/12937
package Lv1;

public class OddEven {
    public static void main(String[] args) {
        
        int num = 3;
        String answer = "";

        // condition = (2로 나누었을 때 나머지가 0이라면)
        if (num % 2 == 0) { 
            answer = "Even";
        }else{
            answer = "Odd";
        }
        System.out.println("answer : " + answer);

        // 삼항 연산자
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("result : " + result);
        
    } // main
}// class

// 배워가는 사이트
// 삼항 연산자 : https://javacoding.tistory.com/121