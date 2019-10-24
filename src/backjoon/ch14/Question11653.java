package backjoon.ch14;

public class Question11653 {
    public static void main(String[] args){
        int num = new java.util.Scanner(System.in).nextInt();
        boolean[] primeNum = new boolean[num+1];

        for(int i = 2; i<num; i++)
            for(int j = 2; i*j <=num; j++)
                primeNum[i*j] = true;



        while(num > 1){
            for(int i = 2; i<primeNum.length; i++){
                if(!primeNum[i]){
                    if(num % i == 0){
                        System.out.println(i);
                        num/= i;
                        break;
                    }
                }
            }
        }
    }
}
