package backjoon.ch08;

public class Question2839 {
    public static void main(String[] args){
        int n = new java.util.Scanner(System.in).nextInt();
        int result = 0;

        while(n > 0){
            if (n % 5 == 0) {
                n -= 5;
                result++;
            }
            else if (n % 3 == 0) {
                n -= 3;
                result++;
            }
            else if (n > 5) {
                n -= 5;
                result++;
            }
            else {
                result = -1;
                break;
            }
        }

        System.out.println(result);
    }
}
