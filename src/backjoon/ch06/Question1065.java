package backjoon.ch06;

import java.util.Scanner;

public class Question1065 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),cnt=0;
        boolean[] array = new boolean[n+1];

        for(int i = 1; i<= n; i++){
            if(i < 100) array[i] = true;
            else{
                if(i/100 - i%100/10 == i%100/10 - i%10) array[i] = true;
            }
        }
        for(boolean a: array){
            if(a) cnt++;
        }
        System.out.println(cnt);
    }
}
