package Programers.Level1;

public class Question12916 {
    public static void main(String[] args){
        System.out.println(solution("PyY"));
    }
    public static boolean solution(String s){
        boolean answer = true;
        int p = 0,y = 0;

        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') p++;
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') y++;
        }

        if(p != y) answer = false;

        return answer;
    }
}
