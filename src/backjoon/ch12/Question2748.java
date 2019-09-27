package backjoon.ch12;

public class Question2748 {
    public static void main(String[] args){
//        int n = new java.util.Scanner(System.in).nextInt();
//        System.out.println(fivonach(n,0,1));
//        System.out.println(fivonacci(n));

        for(int i = 0; i<10000; i++){
            System.out.println(i+"번째 - "+fivonacci(i)%15746);
        }
    }

    public static long fivonach(int n,long prev,long result){
        if(n == 0){
            return 0;
        }else if(n <= 2){
            return 1;
        }else{
            return result + fivonach(--n,result,result+prev);
        }
    }

    public static long fivonacci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fivonacci(n-1)+fivonacci(n-2);
        }
    }
}
