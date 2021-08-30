package Programers.Level1;

import java.util.ArrayList;

public class Question17682 {
    public static void main(String[] args) {
        String dartResult1 = "1S2D*3T";
        System.out.println(solution(dartResult1));
        String dartResult2 = "1D2S#10S";
        System.out.println(solution(dartResult2));
        String dartResult3 = "1D2S0T";
        System.out.println(solution(dartResult3));
        String dartResult4 = "1S*2T*3S";
        System.out.println(solution(dartResult4));
        String dartResult5 = "1D#2S*3S";
        System.out.println(solution(dartResult5));
        String dartResult6 = "1T2D3D#";
        System.out.println(solution(dartResult6));
        String dartResult7 = "1D2S3T*";
        System.out.println(solution(dartResult7));
    }
    public static int solution(String dartResult){
        int answer = 0;
        String[] split = dartResult.split("");
        ArrayList<Integer> calcList = new ArrayList<>();

        int index = -1;
        String number = "";
        for(int i = 0; i<split.length; i++){
            if(split[i].equals("S")){
                calcList.add(Integer.parseInt(number));
                ++ index;
                number = "";
            }else if(split[i].equals("D")){
                calcList.add(calculate(Integer.parseInt(number),2));
                ++index;
                number = "";
            }else if(split[i].equals("T")){
                calcList.add(calculate(Integer.parseInt(number),3));
                ++index;
                number = "";
            }else if(split[i].equals("*")){
                calcList.set(index,calcList.get(index)*2);
                if(index > 0) calcList.set(index-1,calcList.get(index -1)*2);
                number = "";
            }else if(split[i].equals("#")){
                calcList.set(index,calcList.get(index)*-1);
                number = "";
            }else{
                number += split[i];
            }
        }
        for(int calc : calcList){
            answer += calc;
        }
        System.out.println(calcList.toString());
        return answer;
    }

    public static int calculate(int num, int index){
        int result = num;
        for(int i = 1; i<index; i++){
            result *= num;
        }
        return result;
    }
}
