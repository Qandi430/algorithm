package backjoon.ch05;

import java.util.Scanner;

public class Question4344 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        double average,result;
        int size;
        int[] pointList;
        for(int testNum = 0; testNum < testCase; testNum++){
            average = 0;
            result = 0;
            size = sc.nextInt();
            pointList = new int[size];

            for(int i = 0; i< size; i++){
                pointList[i] = sc.nextInt();
                average += (double) pointList[i];
            }
            average = average/size;
            for(int point : pointList){
                if(point > average) result ++;
            }
            System.out.printf("%.3f%%\n",result/size*100);
        }
    }
}
