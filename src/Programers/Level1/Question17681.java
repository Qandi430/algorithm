package Programers.Level1;

public class Question17681 {
    public static void main(String[] args){
        int n1 = 5;
        int[] arr11 = {9, 20, 28, 18, 11};
        int[] arr12 = {30, 1, 21, 17, 28};
//        System.out.println(solution(n1,arr11,arr12));
        arrayToString(solution(n1,arr11,arr12));
        int n2 = 6;
        int[] arr21 = {46, 33, 33 ,22, 31, 50};
        int[] arr22 = {27 ,56, 19, 14, 14, 10};
        arrayToString(solution(n2,arr21,arr22));
    }
    public static String[] solution(int n, int[] arr1,int[] arr2){
        String[] answer = new String[n];
        for(int i = 0; i<n; i++){
            String transfer1 = transfer(arr1[i],n);
            String transfer2 = transfer(arr2[i],n);
            String a = "";
            for(int j = 0; j<n; j++){
                if(transfer1.charAt(j) == '1' || transfer2.charAt(j) == '1'){
                    a += "#";
                }else{
                    a += " ";
                }
            }
            answer[i] = a;
        }
        return answer;
    }
    public static String transfer(int number, int masLength){
        String result = "";
        while(true){
            result = number%2 + result;
            number = number/2;
            if(number < 2){
                result = number + result;
                break;
            }
        }

        if(result.length() < masLength){
            String last = "";
            for(int i = 0; i<masLength-result.length(); i++){
                last += "0";
            }
            result = last+result;
        }
        return result;
    }

    public static void arrayToString(String[] array){
        System.out.println("-------------");
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("-------------");
    }
}
