// 가장 가까운 같은 글자 // 해결 ㄴㄴ
// https://school.programmers.co.kr/learn/courses/30/lessons/142086
package CodingTest_Programmers.Lv1;

import java.util.Arrays;

class NearWordIndex {
    public static void main(String[] args) {
            String s = "banana";
            int farCount = 0;
            int[] answer = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                answer[i] = farCount;
                for (int j = i - 1; j < s.length(); j--) {
                    if (s.charAt(i) == s.charAt(j)) {
                        farCount = i - j;
                    } else {
                        farCount = -1;
                    }
                }
            }
            System.out.println(Arrays.toString(answer));
    }//main
} //class

// 배워가는 사이트
// VSC단축키 : https://inpa.tistory.com/entry/VS-Code-%E2%8F%B1%EF%B8%8F-%EC%9C%A0%EC%9A%A9%ED%95%9C-%EB%8B%A8%EC%B6%95%ED%82%A4-%EC%A0%95%EB%A6%AC#HTML_%EC%B4%88%EA%B8%B0_%ED%83%9C%EA%B7%B8_%EC%9E%90%EB%8F%99%EC%99%84%EC%84%B1
// main 함수 : https://mozi.tistory.com/553
// String과 new String()의 차이 : https://tomining.tistory.com/195