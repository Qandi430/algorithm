package Programers.Level1;

public class Question12912 {
    public static void main (String[] args){
        System.out.println(solution(3,5));
    }

    public static long solution(int a, int b){
        long answer = 0;
        int min,max;
        if(a>b){
            min = b;
            max = a;
        }else{
            min = a;
            max = b;
        }

        for(int i = min; i<=max; i++){
            answer += i;
        }

        return answer;
    }
}