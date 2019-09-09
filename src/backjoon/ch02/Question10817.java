package backjoon.ch02;

import java.util.Scanner;

public class Question10817 {
    public static void main(String[] args){
        int[] array = new int[3];
        Scanner sc = new Scanner(System.in);
        array[0]= sc.nextInt();
        array[1] = sc.nextInt();
        array[2] =sc.nextInt();
        int temp = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(array[j] > array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print(array[1]);
    }
}
