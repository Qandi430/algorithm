package backjoon.ch02;

import java.util.Scanner;

public class Question2884 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(),m = sc.nextInt();

        if(m < 45){
            if(h == 0){
               h = 23;
            }else{
                h -= 1 ;
            }
            m = 60+m-45;
        }else{
            m -= 45;
        }
        System.out.printf("%d %d",h,m);
    }
}
