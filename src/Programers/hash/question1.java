package Programers.hash;

import java.util.HashMap;
import java.util.Map;

public class question1 {
    public static void main(String[] args){
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        System.out.println(solution(1,participant1,completion1));
        System.out.println(solution(2,participant2,completion2));
        System.out.println(solution(3,participant3,completion3));
    }

    public static String solution(int no,String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i<participant.length; i++){
            if(map.get(participant[i]) == null){
                map.put(participant[i],1);
            }else{
                map.put(participant[i],map.get(participant[i])+ 1);
            }
        }
        for(int i = 0; i<completion.length; i ++){
            map.put(completion[i],map.get(completion[i]) -1);
        }
        for(String key : map.keySet()){
            if(map.get(key) > 0){
                answer = key;
            }
        }
        return answer;
    }


}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}

