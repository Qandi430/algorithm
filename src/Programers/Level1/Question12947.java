package Programers.Level1;

public class Question12947 {
    public static void main(String[] args){
        System.out.println(solution(11));
    }
    public static boolean solution(int x){
        int num = x,division = 0;
        while(num > 0){
            division += num%10;
            num/=10;
        }
        return x%division == 0;
    }
}
