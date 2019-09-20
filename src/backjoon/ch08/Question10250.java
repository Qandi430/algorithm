package backjoon.ch08;

import java.util.Scanner;

public class Question10250 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int h,w,n,front,back,current;

        for(int test = 0; test < testCase; test++){
            h = sc.nextInt();
            w = sc.nextInt();
            n = sc.nextInt();
            front = 1;
            back = 1;
            current = 1;

            while(current < n){
                if(front == h){
                    front = 1;
                    back ++;
                }else{
                    front ++;
                }
                current++;
            }
            System.out.println((front*100)+back);
        }
    }
}
