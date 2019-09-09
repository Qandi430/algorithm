package backjoon.ch01;

import java.util.Scanner;

public class Question10430 {
    //첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
    //첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println((a + b)%c);
        System.out.println((a%c + b%c)%c);
        System.out.println((a * b)%c);
        System.out.println((a%c * b%c)%c);
    }
}
