// ReverseNumberArray // Finish
// https://school.programmers.co.kr/learn/courses/30/lessons/12932
package Lv1;

public class ReverseNumberArray {
    public static void main(String[] args) {
        long n = 12345;
        int len = (int)(Math.log10(n)+1); // 자릿수를 구하는 Math 활용
        int[] answer = new int[len];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Long.valueOf(n % 10).intValue(); // long2int 형변환
            n/= 10;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + ", ");
        }
    } // main
} // class

// 배워가는 사이트
// long을 int 형변환 : https://blog.naver.com/PostView.nhn?blogId=ka28&logNo=222104505635
// 자릿수 구하기 : https://oneprogram.tistory.com/116