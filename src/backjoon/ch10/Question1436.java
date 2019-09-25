package backjoon.ch10;

public class Question1436 {
    public static void main(String[] args){
        int n = new java.util.Scanner(System.in).nextInt();
        int result = 0;
        int count = 6;
        int temp;
        if(n > 6){
            temp = 6000;
            while(count != n){
                temp ++;
                if(String.valueOf(temp).indexOf("666") > -1){
                    count ++;
                    result = temp;
                }
            }
        }else{
            result = ((n-1)*1000)+666;
        }
        System.out.println(result);
    }
}
