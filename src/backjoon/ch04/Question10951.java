package backjoon.ch04;

import java.util.Scanner;

public class Question10951 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){// EOF처리
            System.out.println(sc.nextInt() + sc.nextInt());
        }
    }
}
