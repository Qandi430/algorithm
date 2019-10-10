package Programers.Level1;

public class Question12925 {
    public static void main(String[] args){
        System.out.println(solution("1234"));
    }
    public static int solution(String s){
        int answer  = 0;
        int multiple = 1;

        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == 45 || s.charAt(i) == 43) break;
            answer += (s.charAt(i)-48)*multiple;
            multiple*=10;
        }

        if(s.charAt(0) == 45) answer = 0-answer;

        return answer;
    }
}
