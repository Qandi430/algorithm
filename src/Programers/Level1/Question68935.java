package Programers.Level1;

public class Question68935 {
    public static void main(String[] args){
        int n1 = 45;
        System.out.println(solution(n1));
        int n2 = 125;
        System.out.println(solution(n2));
        int n3 = 1;
        System.out.println(n3);
        for(int i = 1; i<=125; i++){
            System.out.println("i : "+i+" solution : "+solution(i));
        }
    }
    public static int solution(int n){
        int answer = 0;
        //step1 3진법 변환
        //step2 앞뒤 반전
        System.out.println("n : "+n);
        String three = "";
        while (true){
            three += n%3;
            n = n/3;
            if(n < 3){
                if(n != 0) three += n;
                break;
            }
        }
        System.out.println("3진법 : "+three);

        //step3 10진법 표현
        int index = three.length() -1;
        for(int i = 0; i<three.length(); i++){
            int a = Integer.parseInt(three.split("")[i]);
            int b = 1;
            if(index > 0){
                for(int j = 1; j<=index; j++){
                    b*=3;
                }
            }
            answer += a*b;
            index -=1;
        }

        return answer;
    }
}
