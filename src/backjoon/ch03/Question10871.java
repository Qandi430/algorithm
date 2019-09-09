package backjoon.ch03;

import java.util.Scanner;

public class Question10871 {
    public static void main(String[] args){
        int n,x,input;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        x = sc.nextInt();

        for(int i = 0; i < n; i++){
            input = sc.nextInt();
            if( input < x) System.out.print(input + " ");
        }

    }
}
