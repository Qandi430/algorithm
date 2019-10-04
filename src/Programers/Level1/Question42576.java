package Programers.Level1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Question42576 {
    public static void main(String[] args){
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant,completion));
    }

    public static String solution(String[] participant, String[] completion){
        String answer = "";
        Map<String,Integer> hash =  new HashMap<>();

        for(int i = 0; i<participant.length; i++){
            if(hash.get(participant[i]) != null) hash.put(participant[i],hash.get(participant[i])+1);
            else hash.put(participant[i],1);
        }

        for(int j = 0; j<completion.length; j++){
            hash.put(completion[j],hash.get(completion[j])-1);
        }

        Set keySet = hash.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = (String) iterator.next();
            if(hash.get(key) != 0){
                answer = key;
                break;
            }
        }

        return answer;
    }

//    public static String solution(String[] participant, String[] completion){
//        String answer = "";
//        Hash[] hashMap = new Hash[participant.length];
//
//        for(int i = 0; i<participant.length; i++){
//            for(int j = 0; j < hashMap.length; j++){
//                if(hashMap[j] == null){
//                    hashMap[j] = new Hash(participant[i]);
//                    break;
//                }else if(hashMap[j].getName().equals(participant[i])){
//                    hashMap[j].addCount();
//                    break;
//                }
//            }
//        }
//
//        for(int i = 0; i< completion.length; i++){
//            for(int j = 0; j< hashMap.length; j++){
//                if(completion[i].equals(hashMap[j].getName())){
//                    hashMap[j].minusCount();
//                    break;
//                }
//            }
//        }
//
//        for(Hash h : hashMap){
//            if(h == null) break;
//            else if(h.getCount() != 0) answer = h.getName();
//        }
//
//        return answer;
//    }
//
//    static class Hash{
//        String name;
//        int count;
//
//        public Hash(String name) {
//            this.name = name;
//            this.count = 1;
//        }
//
//        String getName(){
//            return this.name;
//        }
//
//        int getCount(){
//            return this.count;
//        }
//
//        void addCount(){
//            this.count += 1;
//        }
//
//        void minusCount(){
//            this.count -=1;
//        }
//    }
}
