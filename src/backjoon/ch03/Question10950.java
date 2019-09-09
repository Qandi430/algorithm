package backjoon.ch03;

import java.util.Scanner;

public class Question10950 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase,a,b;
        testCase = sc.nextInt();
        for(int i = 0; i<testCase; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
