package backjoon.ch08;

public class Question2292 {
    public static void main(String[] args){
        long n = new java.util.Scanner(System.in).nextLong();
        long result = 1;
        int index = 1,step = 1;

        while(index < n){
            result ++;
            index = index + (6*step);
            step++;
        }
        System.out.println(result);
    }
}
