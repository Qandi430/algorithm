package Programers.Level1;

public class Question12918 {
    public static void main(String[] args){
        System.out.println(solution("1234"));
    }
    public static boolean solution(String s){
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) > 57 || s.charAt(i) < 48){
                    answer = false;
                    break;
                }
            }
        }else{
            answer = false;
        }

        return answer;
    }
}
