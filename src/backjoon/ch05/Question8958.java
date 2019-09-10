package backjoon.ch05;

import java.util.Scanner;

public class Question8958 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(), curPoint, point;
        String[] strings;
        for(int i = 0; i<size; i++){
            strings = sc.next().split("");
            curPoint = 0;
            point = 0;
            for( int j = 0; j<strings.length; j++){
                if(strings[j].equals("O")){
                    curPoint ++;
                }else{
                    curPoint = 0;
                }
                point += curPoint;
            }
            System.out.println(point);
        }
    }
}
