package backjoon.ch16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String input;
        Queue queue = new Queue(cnt);
        while (cnt > 0){
            input = br.readLine();
            if(input.indexOf("push") > -1){
                queue.push(Integer.parseInt(input.split(" ")[1]));
            }else if(input.indexOf("front")>-1){
                System.out.println(queue.front());
            }else if(input.indexOf("back") > -1){
                System.out.println(queue.back());
            }else if(input.indexOf("empty") > -1){
                System.out.println(queue.empty());
            }else if(input.indexOf("pop") > -1){
                System.out.println(queue.pop());
            }else if(input.indexOf("size") > -1){
                System.out.println(queue.size());
            }
            cnt--;
        }
    }
}

class Queue{
    int front = 0;
    int rear = -1;
    int[] queueList;

    public Queue(int size){
        this.queueList = new int[size];
    }

    void push(int num){
        queueList[++rear] = num;
    }

    int pop(){
        if(rear == -1){
            return -1;
        }else{
            int result = queueList[front];
            for(int i = 1; i<queueList.length;i++){
                queueList[i-1] = queueList[i];
            }
            rear--;
            return result;
        }
    }

    int empty(){
        if(rear==-1)
            return 1;
        else
            return 0;
    }

    int front(){
        if(rear == -1)
            return -1;
        else
            return queueList[front];
    }

    int back(){
        if(rear == -1)
            return -1;
        else
            return queueList[rear];
    }

    int size(){
        return rear+1;
    }
}
