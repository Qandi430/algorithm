package backjoon.ch14;

import java.util.Scanner;

public class Question1037 {
    public static void main(String[] args){
//        for(int i = 2; i<=100; i++){
//            System.out.println("======================"+i+"======================");
//            for(int j = 2; j<i; j++){
//                if(i%j==0)System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        int min;

        for(int i = 0; i<cnt; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i< cnt; i++){
            min = i;
            for(int j = i+1; j<cnt; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        int answer = cnt > 1 ? arr[0]*arr[cnt-1] : arr[0]*arr[0];

        System.out.println(answer);
    }
}
