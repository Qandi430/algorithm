package backjoon.ch03;

public class Question893 {
    public static void main(String[] args){
        int testCase = new java.util.Scanner(System.in).nextInt(),result = 0;
        for(int i = testCase; i > 0; i-- ){
            result += i;
        }
        System.out.print(result);
    }
}
