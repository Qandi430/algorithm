package backjoon.ch03;

import java.util.Scanner;

public class Question11022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size,a,b;
        size = sc.nextInt();

        for(int i = 1; i<=size; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n",i,a,b,a+b);
        }
    }
}
