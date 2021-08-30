package Programers.hash;

import java.util.*;


public class question3 {
    public static void main(String[] args){
        String[][] clothes1 = {{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"},{"green_turban", "headgear"}};
        String[][] clothes2 = {{"crowmask", "face"},{"bluesunglasses", "face"},{"smoky_makeup", "face"}};
        String[][] clothes3 = {
                {"a","a"},{"b","a"},
                {"c","b"},{"d","b"},{"e","b"},{"f","b"},
                {"g","c"},{"h","c"},
                {"i","d"},{"j","d"},
        };
        String[][] clothes4 = {
                {"a", "aa"},
                {"b", "aa"},
                {"c", "aa"},
                {"aa", "bb"},
                {"bb", "bb"},
                {"c_c", "bb"},
                {"aaa", "cc"},
                {"bbb", "cc"},
                {"ccc", "cc"}
        };
//        System.out.println(solution(clothes3));
//        System.out.println(solution(clothes2));
//        System.out.println(solution(clothes1));
        System.out.println(solution(clothes4));
    }

    public static int solution(String[][] clothes){
        int answer = 1;
        HashMap<String, Integer> clothesMap = new HashMap<>();
        for(String[] cloth : clothes){
            clothesMap.put(cloth[1], clothesMap.getOrDefault(cloth[1], 0) + 1);
        }
        for (String key : clothesMap.keySet()) {
            answer *= (clothesMap.get(key) + 1);
        }
        answer -= 1;
        return  answer;
    }

}
