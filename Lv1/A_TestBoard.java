package Lv1;

public class A_TestBoard {
    public static void main(String[] args) {
        long n1 =  82;
        long n2 =  81;
        
        double x1 = Math.sqrt(n1); // n의 제곱근
        System.out.println(x1);
        double x2 = Math.sqrt(n2); // n의 제곱근
        System.out.println(x2);

        System.out.println(x1%1);
        System.out.println(x2%1);
       
        // if(x%1==0){
        //     long answer = (x+1)*(x+1);
        //     System.out.println(answer);
        // }else{
        //     System.out.println(-1);
        // }
    }
}
