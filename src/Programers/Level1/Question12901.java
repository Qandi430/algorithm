package Programers.Level1;

public class Question12901 {
    public static void main(String[] args){
        System.out.println(solution(2,1));
    }

    public static String solution(int a, int b){
        String answer = "";
        int totalDay = b;
        /**
         * 1 - 31
         * 2 - 29
         * 3 - 31
         * 4 - 30
         * 5 - 31
         * 6 - 30
         * 7 - 31
         * 8 - 31
         * 9 - 30
         * 10 - 31
         * 11 - 30
         * 12 - 31
         */

        for(int i = 1; i<a; i++){
            if(i == 2){
                totalDay += 29;
            }else{
                if(i > 7){
                    totalDay += i%2 == 0 ? 31 : 30;
                }else{
                    totalDay += i%2 == 0 ? 30 : 31;
                }
            }
        }


        switch (totalDay%7){
            case 1 :
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4 :
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
            case 0 :
                answer = "THU";
                break;
        }

        return answer;
    }
}
