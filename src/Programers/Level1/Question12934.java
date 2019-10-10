package Programers.Level1;

public class Question12934 {
    public static void main(String[] args){
        System.out.println(solution(4));
    }
    public static long solution(long n){
        long answer = 0;
        while(++answer < n){
            if(n/answer == answer) break;
        }
        if(answer == n){
            if(answer == 1) answer = 4;
            else answer = -1;
        }
        else answer = (answer+1)*(answer+1);
        return answer;
    }
}
