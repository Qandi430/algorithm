package Programers.Level2;

import java.util.Arrays;

public class Question42587 {
    public static void main(String[] args){
        Question42587 q = new Question42587();
        System.out.println(q.solution(new int[]{3,3,4,2},3));
    }

    private int solution(int[] priorities, int location) {
        int answer = 1;

        PrintQueue printQueue = new PrintQueue(priorities,location);

        while (!printQueue.outPrint().isLocation()){
            printQueue.sortQueue();
            answer++;
        }

        return answer;
    }
}

class Print{
    int priority;
    boolean location = false;

    public Print(int priorit) {
        this.priority = priorit;
    }

    public Print(int priorit, boolean location) {
        this.priority = priorit;
        this.location = location;
    }

    public int getPriority(){
        return this.priority;
    }

    public boolean isLocation(){
        return this.location;
    }

    @Override
    public String toString() {
        return "Print{" +
                "priorit=" + priority +
                ", location=" + location +
                '}';
    }
}

class PrintQueue{
    int first = 0;
    int last = -1;
    Print[] prints;

    public PrintQueue(int[] priorities, int location){
        this.prints = new Print[priorities.length];
        for(int i = 0; i<priorities.length; i++){
            if(i == location) prints[i] = new Print(priorities[i],true);
            else prints[i] = new Print(priorities[i]);
            last++;
        }
        sortQueue();
    }

    public void sortQueue() {
        int max = 0;
        int index = 0;
        for(int i = 0; i<prints.length; i++){
            if(prints[i]!=null && prints[i].getPriority() > max) max = prints[i].getPriority();
        }
        while (prints[first].getPriority() != max){
            prints[last] = this.outPrint();
            this.last++;
        }
    }

    public Print outPrint(){
        Print out = prints[first];
        for(int i = 1; i< prints.length; i++){
            prints[i-1] = prints[i];
            prints[i] = null;
        }
        this.last--;
        return out;
    }

    @Override
    public String toString() {
        return "PrintQueue{" +
                "first=" + first +
                ", last=" + last +
                ", prints=" + Arrays.toString(prints) +
                '}';
    }
}
