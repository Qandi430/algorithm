package backjoon.ch12;

import java.io.*;

public class Question1003 {
    private static int zero;
    private static int one;
    private static int input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int test = 0; test < testCase; test++){
            input = Integer.parseInt(br.readLine());
            if(input == 0){
                zero = 1;
                one = 0;
            }else if(input >= 1){
                zero = 0;
                one = 1;
            }

            findZeroOne(input);
            System.out.println(zero+" "+one);
        }
    }

    public static void findZeroOne(int index){
        if(index <= 1){
            return;
        }else{
            int temp = one;
            one = zero + one;
            zero = temp;
            findZeroOne(--index);
        }
    }
}
