package Programers.hash;

import java.util.HashMap;

public class question2 {

    public static void main(String[] args){
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123","456","789"};
        String[] phone_book3 = {"12","123","1235","567","88"};
        System.out.println(solution(phone_book1));
        System.out.println(solution(phone_book2));
        System.out.println(solution(phone_book3));

        HashMap<String , Integer> map = new HashMap<String , Integer>();

        map.put("신논현", 1);
        map.put("강남", 2);
        map.put("혜화", 3);
        map.put("안양", 4);
        map.put("수원", 5);

        System.out.println(map.containsKey("논현"));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i = 0; i < phone_book.length; i ++){
            for(int j = 0; j < phone_book.length; j ++){
                if(j != i && phone_book[i].length() != phone_book[j].length()){
                    if(phone_book[j].startsWith(phone_book[i])){
                        answer = false;
                    };
                }
            }
        }
        return answer;
    }
}
