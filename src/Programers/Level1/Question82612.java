package Programers.Level1;

public class Question82612 {
    public static void main(String[] args){
        int price1 = 3;
        int money1 = 20;
        int count = 4;
        System.out.println(solution(price1,money1,count));
        int price2 = 2500;
        int money2 = 1000000000;
        int count3 = 2500;
        System.out.println(solution(price2,money2,count3));
    }
    public static long solution(int price, int money, int count){
        long current = 0;
        for(int i = 1; i<= count; i++){
            current += price * i;
//            System.out.println(current);
        }
        return current - money <= 0 ? 0 : current-money;
    }
}
