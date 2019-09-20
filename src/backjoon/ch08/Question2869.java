package backjoon.ch08;

import java.util.Scanner;

public class Question2869 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),v = sc.nextInt();
        int result,extra;
        System.out.println(chk(a,b,v));
        extra = (v-a)%(a-b) == 0 ? 1 : 2;
        result = (v-a)/(a-b)+extra;

        System.out.println(result);
    }

    public static int chk(int a, int b, int v){
        int height = 0,result = 0;

        while(height < v){
            result ++;
            height += a;
            if(height >= v){
                break;
            }
            height -= b;
            System.out.println(result + "일차 - 올라간거리 : "+height);
        }

        return result;
    }
}
