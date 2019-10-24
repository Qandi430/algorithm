package backjoon.ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int small,big;
        String pop,answer,prev;
        boolean isVpc;
        while (!input.equals(".")){
            small = 0;
            big = 0;
            isVpc = true;
            for(int i = 0; i<input.length();i++){
                pop = input.split("")[i];
                if(pop.equals("(")){
                    small ++;
                }else if(pop.equals(")")){
                    if(small <= 0){
                        isVpc = false;
                        break;
                    }else{
                        small--;
                    }
                }else if(pop.equals("[")){
                    big++;
                }else if(pop.equals("]")){
                    if(big<=0){
                        isVpc = false;
                        break;
                    }else{
                        big --;
                    }
                }
            }

            answer = isVpc&&small==0&&big==0?"YES":"NO";

            System.out.println(answer);
            input = br.readLine();
        }
    }
}
