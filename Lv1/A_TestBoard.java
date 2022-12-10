package Lv1;

public class A_TestBoard {
    public static void main(String[] args) {
        String s = "aabbcc";
        int[] answer = new int[s.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i]=-1;
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]+",");
        }
        System.out.println("");

        for (int i = 1; i < s.length(); i++) {
            for (int j=i-1; j > 0; j--) {
                if (s.charAt(i)==s.charAt(j)) {
                    answer[i]=i-j;
                    break;
                }
            }
        }
        // i=1 j=0 >> 
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]+",");
        }
        System.out.println("");
    }
}
