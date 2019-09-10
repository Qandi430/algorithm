package backjoon.ch05;

import java.util.Scanner;

public class Question10818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input,min = 0,max=0;

        for(int i = 0; i < n; i++){
            input = sc.nextInt();
            if(min == 0 && max ==0){
                min = input;
                max = input;
            }else if(min > input){
                min = input;
            }else if(max < input){
                max = input;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
