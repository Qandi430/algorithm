package backjoon.ch01;

import java.util.Scanner;

public class Question2588 {
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(b%10*a);
        System.out.println(b%100/10*a);
        System.out.println(b%1000/100*a);
        System.out.println(a*b);

    }
}
