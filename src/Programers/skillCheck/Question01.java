package Programers.skillCheck;

public class Question01 {
    public static void main(String[] args){
        System.out.println(solution("PY"));
    }

    public static boolean solution(String s){
        boolean answer = true;
        int chkP = 0;
        int chkY = 0;
        String[] sArray = s.split("");

        for(int i = 0; i< sArray.length; i++){
            if(sArray[i].equals("p") || sArray.equals("P")){
                chkP++;
            }
            if(sArray[i].equals("y") || sArray.equals("Y")){
                chkY++;
            }
        }
        if(chkP != chkY) answer = false;
        if(chkP==0 && chkY==0) answer = false;
        return answer;
    }
}
