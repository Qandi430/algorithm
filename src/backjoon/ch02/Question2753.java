package backjoon.ch02;

import java.util.Scanner;

public class Question2753 {
    public static void main(String[] args){
        int year = new Scanner(System.in).nextInt();

        if(year % 4 == 0 && year%100 != 0){
            System.out.print(1);
        }else if(year %400 == 0){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}
