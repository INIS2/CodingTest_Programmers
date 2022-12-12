// 평균구하기 // Finish
// https://school.programmers.co.kr/learn/courses/30/lessons/12944
package Lv1;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
    int[] arr ={1,3,5,6,7,8,9,87,45,3};

    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
    }
    double answer = sum / arr.length;
    System.out.println("answer : " + answer);

    // new solution
    double new_answer = Arrays.stream(arr).average().getAsDouble();
    System.out.println("new_answer : " + new_answer);

    } // main
} // class

// 배워가는 사이트
// average() : https://zetawiki.com/wiki/%EC%9E%90%EB%B0%94_average()
// stream(람다) : https://coding-factory.tistory.com/574