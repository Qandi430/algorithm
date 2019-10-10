package Programers.Level1;

public class Question12932 {
    public static void main(String[] args){
        int[] result = solition(12345);

        for(int r : result)System.out.println(r);
    }
    public static int[] solition(long n){
        int[] answer = {};
        String[] array = String.valueOf(n).split("");
        answer = new int[array.length];
        for(int i = array.length -1 ; i>=0; i-- ){
            answer[(array.length -1)-i] = Integer.parseInt(array[i]);
        }
        return answer;
    }
}
