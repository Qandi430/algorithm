package backjoon.ch10;

public class Question2231 {
    public static void main(String[] args){
        int n = new java.util.Scanner(System.in).nextInt();
        int temp;
        int test = 0;
        int result = 0;

        while(test < n){
            temp = chkSelfNum(++test);
            if(temp == n){
                result = test;
                break;
            };
        }
        System.out.println(result);
    }

    public static int chkSelfNum(int n){
        String inputToString = String.valueOf(n);
        int result = n;
        for(String input : inputToString.split("")){
            result += Integer.parseInt(input);
        }
        return result;
    }
}
