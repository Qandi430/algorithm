package Programers.Level1;

public class Question12922 {
    public static void main(String[] args){
        System.out.println(solution(3));
    }

    public static String solution(int n){
        String answer = "";
        for(int i = n/2; i > 0; i--){
            answer += "수박";
        }
        if(n%2 == 1) answer += "수";
        return answer;
    }
}
