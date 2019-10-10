package Programers.Level1;

public class Question12948 {
    public static void main(String[] args){
        System.out.println(solution("027778888"));
    }
    public static String solution(String phone_number){
        String answer = "";
        for(int i = 0; i<phone_number.length(); i++)
            answer += i >= phone_number.length()-4 ? phone_number.charAt(i) : "*";
        return answer;
    }
}
