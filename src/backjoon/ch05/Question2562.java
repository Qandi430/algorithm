package backjoon.ch05;

import java.util.Scanner;

public class Question2562 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int max = 0,index = 0,input;

        for(int i = 1; i<= 9; i ++){
            input = sc.nextInt();
            if(input > max){
                max = input;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
