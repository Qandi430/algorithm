package Programers.Level1;

import java.util.ArrayList;
import java.util.List;

public class Question83201 {
    public static void main(String[] args){
        int[][] scores1 = {{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}};
        System.out.println(solution(scores1));
        int[][] scores2 = {{50, 90}, {50, 87}};
        System.out.println(solution(scores2));
        int[][] scores3 = {{70, 49, 90}, {68, 50, 38}, {73, 31, 100}};
        System.out.println(solution(scores3));
    }
    public static String solution(int[][] scores){
        String answer = "";
        //Step1 = 자기점수 리스트;
        int[] personal = new int[scores.length];
//        List<Float> scoreTable = new ArrayList<>();
        float[] scoreTable = new float[scores.length];
        for(int i = 0; i<scores.length; i++){
            personal[i] = scores[i][i];
        }

        for(int i = 0; i<scores.length; i ++){
            int max = personal[i];
            int min = personal[i];
            boolean duplicate = false;
            int sum = 0;
            for(int j = 0;j<scores.length;j++){
                if(i != j){
                    if(personal[i] == scores[j][i]){
                        //유일하지 않음
                        duplicate = true;
                    }else{
                        if(scores[j][i] > personal[i]) max = scores[j][i];
                        if(scores[j][i] < personal[i]) min = scores[j][i];
                    }
                }
                sum += scores[j][i];
            }
            if(!duplicate && (max == personal[i] || min == personal[i])){
                sum -= personal[i];
                scoreTable[i] = ((float)sum/(scores.length -1));
            }else{
                scoreTable[i] = ((float)sum/(scores.length));
            }
            System.out.println(scoreTable[i]);
        }

        for(int i = 0; i< scoreTable.length; i++){
            if(scoreTable[i] >= 90){
                answer += "A";
            }else if(scoreTable[i] >= 80){
                answer += "B";
            }else if(scoreTable[i] >= 70){
                answer += "C";
            }else if(scoreTable[i] >= 50){
                answer += "D";
            }else{
                answer += "F";
            }
        }

        return answer;
    }
}
