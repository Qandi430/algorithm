package Programers.Level1;

public class Question12917 {
    public static void main(String[] args){
        System.out.println(solution("Zbcdefg"));
    }

    public static String solution(String s){
        String answer = "";
        String[] sArray = s.split("");

        for(int i = 0; i< sArray.length; i++){
            for(int j = 0; j< sArray.length; j++){
                if(sArray[i].charAt(0)  > sArray[j].charAt(0)){
                    String temp = sArray[i];
                    sArray[i] = sArray[j];
                    sArray[j] = temp;
                }
            }
        }

        for(String a : sArray){
            answer += a;
        }

        return answer;
    }
}
