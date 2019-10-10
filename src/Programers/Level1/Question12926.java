package Programers.Level1;

public class Question12926 {
    public static void main(String[] args){
        System.out.println(solution("B",25));
    }
    public static String solution(String s, int n){
        String answer = "";
        String[] sArray = s.split("");
        char temp;

        for(int i = 0; i<sArray.length; i++){
            if(sArray[i].charAt(0) == 32){
                answer += sArray[i];
                continue;
            }else{
                temp = (char)(sArray[i].charAt(0) + n);
                if(temp > 90 && sArray[i].charAt(0)<=90) temp = (char)(temp -26);
                else if(temp > 122 && sArray[i].charAt(0)>=97)temp = (char)(temp -26);
                answer += (char) temp;
            }
        }

        return answer;
    }
}
