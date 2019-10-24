package backjoon.ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] numArr = new int[cnt];
        int index = 0,current = 0;
        String result = "";
        String stackMessage;
        for(int i = 0; i<cnt; i++){
            numArr[i] = Integer.parseInt(br.readLine());
        }

        NumStack stack = new NumStack(cnt);

        while (index < cnt){
            if(stack.top() == numArr[index]){
                stackMessage = stack.pop();
                if(stackMessage.equals("NO")){
                    result = "NO";
                    break;
                }else{
                    result += "\n"+stackMessage;
                    index++;
                    continue;
                }
            }
            stackMessage = stack.push(++current);

            if(stackMessage.equals("NO")){
                result = "NO";
                break;
            }
            result += "\n"+stackMessage;
        }

        System.out.println(result);
    }
}
class NumStack{
    int top = -1;
    int[] numArray;

    public NumStack(int size){
        this.numArray = new int[size];
    }

    String push(int num){
        top++;
        if(top > numArray.length-1){
            return "NO";
        }
        numArray[top] = num;
        return "+";
    }

    String pop(){
        if(this.top == -1){
            return "NO";
        }
        top--;
        return "-";
    }

    int top(){
        if(this.top == -1){
            return -1;
        }
        return this.numArray[top];
    }
}

