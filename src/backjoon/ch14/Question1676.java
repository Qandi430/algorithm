package backjoon.ch14;

public class Question1676 {
    public static void main(String[] args){
        int input = new java.util.Scanner(System.in).nextInt();
        System.out.println(factorial(input));
    }
    public static long factorial(int num){
        if(num == 0){
            return 1;
        }else if(num==1){
            return num;
        }else{
            return (factorial(num-1))*num;
        }
    }
}
