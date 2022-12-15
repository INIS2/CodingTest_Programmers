// 정수 제곱근 판별 //에러
// https://school.programmers.co.kr/learn/courses/30/lessons/12934
package Lv1;

public class SquareRoot {
    public static void main(String[] args) {
        // long answer = 0;
        long n =  1000000000000L;

        double x = Math.sqrt(n); // n의 제곱근
        if(x%1==0){
            // 어째선지 형변환이 바로 안된다.
            // long answer = (long)(x+1)*(x+1); >> Error
            String s = String.valueOf(Math.floor((x+1)*(x+1)));
            int i = Integer.parseInt(s);
            long answer = (long)i;
            System.out.println(answer);
        }else{
            System.out.println(-1);
        }

    } // main
} // class

// 배워가는 사이트
// Math.sqrt() : https://coding-factory.tistory.com/532
// long인데 out of range 오류 날 경우 > L을 명시적으로 붙여줘라 : https://needneo.tistory.com/6
// java.lang.NumberFormatException: For input string: "1.000002000001E12" >> Math.floor ?