package backjoon.ch08;

import java.util.Scanner;

public class Question1011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int x,y,k,result;
        //맨 처음과 마지막은 +1 씩 == +2는 달고감
        for(int test = 0; test < testCase; test++){
            x = sc.nextInt();
            y = sc.nextInt();
            k = 0;
            result = 0;
            while(x != y){
                if(k == 0){
                    x++;
                    k++;
                }else{
                    if(x+(k+1) < y){
                        x +=2;
                        k ++;
                    }else if(x+k < y){
                        x++;
                    }else{
                        x += k-1;
                        k --;
                    }
                }
                result ++;
            }
            System.out.println(result);
        }
    }
}
