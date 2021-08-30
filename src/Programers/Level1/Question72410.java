package Programers.Level1;

public class Question72410 {
    public static void main(String[] args){
        String new_id1 = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution(new_id1));
        String new_id2 = "z-+.^.";
        System.out.println(solution(new_id2));
        String new_id3 = "=.=";
        System.out.println(solution(new_id3));
        String new_id4 = "123_.def";
        System.out.println(solution(new_id4));
        String new_id5 = "abcdefghijklmn.p";
        System.out.println(solution(new_id5));
    }

    public static String solution(String new_id){
        String answer = "";
        String regex;
        System.out.println("new_id : "+new_id);
        //Step1 = 대문자 소문자 치환
        answer = new_id.toLowerCase();
        System.out.println("step1 : "+answer);
        //Step2 = 알파벳 소문자, 숫자, 빼기(-), 밑줄(_),마침표를 제외한 문자 제거
        regex = "[^-_.a-z0-9]";
        answer = answer.replaceAll(regex,"");
        System.out.println("step2 : "+answer);
        //Step3 = 마침표가 2개 연속된 부분은 마침표 하나로 치환
        regex = "[.]{2,}";
        answer = answer.replaceAll(regex,".");
        System.out.println("step3 : "+answer);
        //Step4 = 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        regex = "^[.]|[.]$";
        answer = answer.replaceAll(regex,"");
        System.out.println("step4 : "+answer);
        //Step5 = new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        regex = "";
        answer = answer.equals("")?"a":answer;
        System.out.println("step5 : "+answer);
        //Step6 = new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        regex = "[.]$";
        answer = answer.length() >= 16 ? answer.substring(0,15).replaceAll(regex,""):answer;
        System.out.println("step6 : "+answer);
        //Step7 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if(answer.length() < 3){
            for(int i = answer.length(); i< 3; i++){
                answer += answer.split("")[answer.length()-1];
            }
        }
        System.out.println("step7 : "+answer);
        return answer;
    }
}
