package backjoon.ch11;

import java.util.Scanner;

public class Question2750 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int temp;

        for(int i = 0; i<n; i++){
            array[i]  = sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            for(int j=0;j<n; j++){
                if(array[i] < array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        for( int a :array){
            System.out.println(a);
        }
    }
}
