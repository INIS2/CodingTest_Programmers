// 문자열 내 p와 y의 개수 // finish
// https://school.programmers.co.kr/learn/courses/30/lessons/12916
package Lv1;

public class CountPY {
    public static void main(String[] args) {
        String s = "PpYy";
        int p = 0;
        int y = 0;
        String LowS = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            if ("p".equals(LowS.substring(i,i+1))) {
                p++;
                System.out.println(p);
            } else if("y".equals(LowS.substring(i,i+1))) {
                y++;
                System.out.println(y);
            } else{
                continue;
            }
        }
        System.out.println("p >> " + p);
        System.out.println("y >> " + y);
        if (p==y) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    } // main
} // class

// 배워가는 사이트
// 전부 대문자로 or 소문자로 : https://pink-rabbit.tistory.com/9
// 다른사람들은 람다를 쓰거나, charAt 사용