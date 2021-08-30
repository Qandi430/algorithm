package Programers.Level1;

public class Question81301 {
    public static void main(String[] args){
        String s1 = "one4seveneight";
        System.out.println(solution(s1));
        String s2 = "23four5six7";
        System.out.println(solution(s2));
        String s3 = "2three45sixseven";
        System.out.println(solution(s3));
        String s4 = "123";
        System.out.println(solution(s4));
    }
    public static int solution(String s){
      int answer = 0;
      String a;
      a = s.replaceAll("zero","0");
      a = a.replaceAll("one","1");
      a = a.replaceAll("two","2");
      a = a.replaceAll("three","3");
      a = a.replaceAll("four","4");
      a = a.replaceAll("five","5");
      a = a.replaceAll("six","6");
      a = a.replaceAll("seven","7");
      a = a.replaceAll("eight","8");
      a = a.replaceAll("nine","9");
      answer = Integer.valueOf(a);
      return answer;
    };
}
