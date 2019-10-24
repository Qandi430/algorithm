package backjoon.ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int answerCnt;
        boolean isVpc;
        String pop,answer;

        while (cnt > 0){
            answerCnt = 0;
            isVpc = true;
            VpsChecker vc = new VpsChecker(br.readLine());

            while(vc.top() > 0){
                pop = vc.pop();
                if(answerCnt == 0){
                    if(!pop.equals(")")){
                        isVpc = false;
                        break;
                    }else{
                        answerCnt++;
                    }
                }else{
                    if(pop.equals(")")) answerCnt++;
                    else answerCnt--;
                }
                if(answerCnt==-1){
                    isVpc = false;
                    break;
                }
            }

            answer = isVpc&&answerCnt==0?"YES":"NO";

            System.out.println(answer);
            cnt--;
        }
    }
}
class VpsChecker{
    String[] list;
    int top;

    public VpsChecker(String input){
        this.list = input.split("");
        this.top = input.length()-1;
    }

    String pop(){
        if(top == -1){
            return null;
        }else{
            return list[top--];
        }
    }

    int top(){
        return top+1;
    }
}
