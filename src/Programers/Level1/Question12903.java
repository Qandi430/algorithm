package Programers.Level1;

public class Question12903 {
    public static void main(String[] args){
        System.out.println(solution("abcdef"));
    }
    public static String solution(String s){
        String answer = "";

        int length = s.length();

        if(length%2 == 0){
            answer  += s.split("")[(length/2)-1];
            answer  += s.split("")[length/2];
        }else{
            answer = s.split("")[length/2];
        }
        return answer;
    }
}
