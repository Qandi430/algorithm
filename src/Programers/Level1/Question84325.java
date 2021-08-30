package Programers.Level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question84325 {
    public static void main(String args[]){
        System.out.println("SI".compareTo("PORTAL"));
        System.out.println("PORTAL".compareTo("SI"));
        String[] table1 = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages1 = {"PYTHON", "C++", "SQL"};
        int[] preference1 = {7, 5, 5};
        System.out.println(solution(table1,languages1,preference1));
        String[] table2 = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages2 = {"JAVA", "JAVASCRIPT"};
        int[] preference2 = {7, 5};
        System.out.println(solution(table2,languages2,preference2));

    }
    public static String solution(String[] table, String[] languages, int[] preference){
        String answer = "";

        HashMap<String,Integer> scoreTable = new HashMap<>();

        for(int i = 0; i<table.length; i++){
            List<String> tableRow = Arrays.asList(table[i].split(" "));
            scoreTable.put(tableRow.get(0),0);
            for(int j = 0; j<languages.length; j ++){
                if(tableRow.indexOf(languages[j]) > 0){
                    scoreTable.put(tableRow.get(0),scoreTable.get(tableRow.get(0)) + (preference[j] * (6 - tableRow.indexOf(languages[j]))));
                }
            }
            if(answer == "") {
                answer = tableRow.get(0);
            }else{
                if(scoreTable.get(tableRow.get(0)) > scoreTable.get(answer)){
                    answer = tableRow.get(0);
                }else if(scoreTable.get(tableRow.get(0)) == scoreTable.get(answer)){
                    answer = tableRow.get(0).compareTo(answer) < 0 ? tableRow.get(0) : answer;
                }
            }
        }
        return answer;
    }
}
