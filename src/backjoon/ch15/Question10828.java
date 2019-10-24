package backjoon.ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int order = Integer.parseInt(br.readLine());
        String input;
        Stack stack = new Stack(order);
        while (order > 0){
            input = br.readLine();

            if(input.indexOf("push") > -1){
                stack.push(Integer.parseInt(input.split(" ")[1]));
            }else if(input.indexOf("top")>-1){
                System.out.println(stack.top());
            }else if(input.indexOf("size") > -1){
                System.out.println(stack.size());
            }else if(input.indexOf("empty") > -1){
                System.out.println(stack.empty());
            }else if(input.indexOf("pop") > -1){
                System.out.println(stack.pop());
            }

            order --;
        }
    }
}
class Stack{
    int num;
    int top = -1;
    int[] list;

    public Stack(int size){
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

    int size(){
        return top+1;
    }

    int empty(){
        return top >= 0 ? 0:1;
    }

    int top(){
        if(top == -1){
            return -1;
        }else{
            return list[top];
        }
    }
}
