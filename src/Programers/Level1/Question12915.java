package Programers.Level1;

public class Question12915 {
    public static void main(String[] args){
        String[] strings1 = {"sun", "bed", "car"};
        int n1 = 1;
        arrayToString(solution(strings1,n1));
        String[] strings2 = {"abce", "abcd", "cdx"};
        int n2 = 2;
        arrayToString(solution(strings2,n2));
    }
    public static String[] solution(String[] strings, int n){
        int min;
        String temp;
        for(int i = 0; i<strings.length;i++){
            min = i;
            for(int j = i; j<strings.length; j++){
                if(strings[min].charAt(n) > strings[j].charAt(n)) min = j;
                if(strings[min].charAt(n) == strings[j].charAt(n)) min = strings[min].compareTo(strings[j]) > 0 ? j : min;
            }
            temp = strings[i];
            strings[i] = strings[min];
            strings[min] = temp;
        }
        return strings;
    }

    public static void arrayToString(String[] array){
        System.out.println("-------------");
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("-------------");
    }
}
