package Programers.Level1;

public class Question12943 {
    public static void main(String[] args){
        System.out.println(solution(1));
    }
    public static int solution(int num){
        int answer = 0;
        long n = num;
        if(n == 1) return 0;
        while(answer++<=500){
            n = n%2 == 0 ? n/2 : n*3+1;
            if(n == 1) break;
        }
        if(answer > 500) answer = -1;
        return answer;
    }
}
