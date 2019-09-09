package backjoon.ch03;

public class Question2438 {
    public static void main(String[] args){
        int size = new java.util.Scanner(System.in).nextInt();

        for(int i = 1; i<=size; i++){
            for(int j = size; j>= 1; j--){
                if(j <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
