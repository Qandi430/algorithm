package backjoon.ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int input;

        Account account = new Account(cnt);

        while (cnt > 0){
            input = Integer.parseInt(br.readLine());

            if(input >  0){
                account.push(input);
            }else{
                account.pop();
            }
            cnt--;
        }

        System.out.println(account.calculate());

    }
}
class Account{
    int top = -1;
    int[] list;

    public Account(int size){
        this.list = new int[size];
    }

    void push(int num){
        top++;
        list[top] = num;
    }

    int pop(){
        if(top == -1){
            return -1;
        }else{
            return list[top--];
        }
    }

    public int calculate() {
        int result = 0;
        if(top > -1){
            for(int i = 0; i<= top; i++){
                result += list[i];
            }
        }
        return result;
    }
}
