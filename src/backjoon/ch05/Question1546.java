package backjoon.ch05;

import java.util.Scanner;

public class Question1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int max = 0,input;
        double result = 0;

        for(int i = 0; i<size; i++){
            input = sc.nextInt();
            if(input > max) max = input;
            array[i] = input;
        }

        for(int a : array){
            result += ((double) a/max)*100;
        }

        System.out.println(result/size);
    }
}
