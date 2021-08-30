package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int received = input.nextInt();
        int price = input.nextInt();
        int change = received - price;
        System.out.println(change);

        System.out.println("Dolor : "+change/100);
        change = change%100;
        System.out.println("Quarter : "+change/25);
        change = change%25;
        System.out.println("Dime : "+change/10);
        change = change%10;
        System.out.println("Nickel : "+change/5);
        change = change%5;
        System.out.println("Penny : "+change);
    }
}
