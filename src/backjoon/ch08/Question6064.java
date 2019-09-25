package backjoon.ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question6064 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        String[] readLine;
        int m,n,x,y,max,gap,line,lineTop,result;
        for(int test = 0; test<testCase; test++) {
            readLine = br.readLine().split(" ");
            m = Integer.parseInt(readLine[0]);
            n = Integer.parseInt(readLine[1]);
            x = Integer.parseInt(readLine[2]);
            y = Integer.parseInt(readLine[3]);

            lineTop = 1;
            line = 1;
            gap = m-n;
            max = m % 2 == 0 && n % 2 == 0 ? m * (n / 2) : m * n;

            while (lineTop != n-y){
                lineTop += gap;
                if(lineTop > n) lineTop = lineTop - n;
                if(lineTop < 0) lineTop = n + lineTop;
                line ++;
            }

            result = line * m+gap;
            if(result > max) result = -1;
            System.out.println(result);
        }
    }

//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int testCase = Integer.parseInt(br.readLine());
//        String[] readLine;
//        int m,n,x,y,front,back,result,max;
//
//        for(int test = 0; test<testCase; test++){
//            readLine = br.readLine().split(" ");
//            m = Integer.parseInt(readLine[0]);
//            n = Integer.parseInt(readLine[1]);
//            x = Integer.parseInt(readLine[2]);
//            y = Integer.parseInt(readLine[3]);
//
//            result = 1;
//            front = 1;
//            back = 1;
//            max = m%2==0 && n%2==0 ? m*(n/2) : m*n;
//
//            while(result <= max){
//                if(front == x && back ==y) break;
//                result ++;
//
//                front++;
//                back++;
//
//                if(front > m){
//                    front  = 1;
//                }
//
//                if(back > n){
//                    back = 1;
//                }
//            }
//            if(result > max) result = -1;
//            System.out.println(result);
//        }
//    }
}
