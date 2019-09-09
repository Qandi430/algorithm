package backjoon.ch03;

public class Question2739 {
    //N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
    public static void main(String[] args){
        int n = new java.util.Scanner(System.in).nextInt();

        for(int i = 1; i<=9; i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }
}
