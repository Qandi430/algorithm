package backjoon.ch06;

public class Question10872 {
    public static void main(String[] args){
        System.out.println(factorial(new java.util.Scanner(System.in).nextInt()));
    }
    static int factorial(int n){
        if(n == 0){
            return 1;
        }else if(n == 1){
            return n;
        }else{
            return (factorial(n-1))*n;
        }
    }
}
