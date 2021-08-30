package Programers.hash;

import java.util.*;

public class question4 {
    public static void main(String[] args){
        String[] genres = {"classic", "pop", "classic", "classic", "pop","dance","dance"};
        int[] plays = {500, 600, 150, 800, 2500,20000,1300};
        System.out.println(solution(genres,plays));
    }
    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i<genres.length; i++){
            hm.put(genres[i], hm.getOrDefault(genres[i], 0) + plays[i]);
        }
        List<Map.Entry<String, Integer>> list_entries = new ArrayList<Map.Entry<String, Integer>>(hm.entrySet());
        // 비교함수 Comparator를 사용하여 내림 차순으로 정렬
        Collections.sort(list_entries, new Comparator<Map.Entry<String, Integer>>() {
            // compare로 값을 비교
            public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2){
                // 내림 차순으로 정렬
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });

        for(Map.Entry<String, Integer> entry : list_entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        return answer;
    }
}
