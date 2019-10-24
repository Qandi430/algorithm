package backjoon.ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1051 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//
//        int n = Integer.parseInt(input.split(" ")[0]);
//        int k = Integer.parseInt(input.split(" ")[1]);
//        System.out.println(factorial(n));
//        System.out.println(factorial(k));
//        System.out.println(factorial(n-k));
//        System.out.println((factorial(n)/(factorial(k)*factorial(n-k)))%10007);

        for(int i = 1000; i>0;i--){
            System.out.println(i+" = "+factorial(i));
        }
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
