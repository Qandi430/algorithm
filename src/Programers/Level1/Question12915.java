package Programers.Level1;

public class Question12915 {
    public static void main(String[] args){
        String[] result = solution(new String[] {"abce","abcd","cdx"},2);

        for(String s :result){
            System.out.println(s);
        }
    }
    public static String[] solution(String[] strings, int n){

        for(int i = 0; i< strings.length; i++){
            for(int j = 0; j<strings.length; j++){
                if( i != j){
                    if(strings[i].charAt(n) < strings[j].charAt(n)){
                        String temp  = strings[i];
                        strings[i]  = strings[j];
                        strings[j] = temp;
                    }
                }
            }
        }

        return strings;
    }
}
