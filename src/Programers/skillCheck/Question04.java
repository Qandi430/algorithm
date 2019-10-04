package Programers.skillCheck;

public class Question04 {
    public static void main(String[] args){
        System.out.println(solution("JAZ"));
    }
    public static int solution(String name){
        int answer = 0;
        int current;
        for(int i = 0; i<name.length();i++){
            current = name.charAt(i)-65;
            if(current == 0){
                answer += 0;
            }else if(current > 13){
                answer += 26-current;
            }else{
                answer += current;
            }

            if(i != name.length() -1) answer++;
        }
        return answer;
    }
}
