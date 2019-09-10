package backjoon.ch05;

import java.util.Scanner;

public class Question2577 {
    public static void main(String[] args){
        int[] resultArray  = new int[10];
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String[] array = String.valueOf(a*b*c).split("");

        for(int i = 0; i<array.length; i++){
            resultArray[Integer.parseInt(array[i])]++;
        }

        for(int result : resultArray){
            System.out.println(result);
        }
    }
}
