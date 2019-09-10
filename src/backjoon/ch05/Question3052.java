package backjoon.ch05;

import java.util.Scanner;

public class Question3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[1000];

        int count = 0;

        for(int i = 0; i<10; i++){
            array[sc.nextInt()%42] ++;
        }

        for(int a : array){
            if(a != 0) count ++;
        }

        System.out.println(count);
    }
}
