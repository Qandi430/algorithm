package backjoon.ch04;

import java.util.Scanner;

public class Question10952 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt();
        while(a != 0 && b != 0){
            System.out.println(a+b);
            a = sc.nextInt();
            b = sc.nextInt();
        }
    }
}
