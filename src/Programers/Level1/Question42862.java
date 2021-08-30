package Programers.Level1;

public class Question42862 {
    public static void main(String[] args){
        int n1 = 5;
        int[] lost1 = {2,4};
        int[] reserve1 = {1,3,5};
        System.out.println(solution(n1,lost1,reserve1));
        int n2 = 5;
        int[] lost2 = {2,4};
        int[] reserve2 = {3};
        System.out.println(solution(n2,lost2,reserve2));
        int n3 = 3;
        int[] lost3 = {3};
        int[] reserve3 = {1};
        System.out.println(solution(n3,lost3,reserve3));
        int n4 = 3;
        int[] lost4 = {2,3};
        int[] reserve4 = {1};
        // return 2;
        System.out.println(solution(n4,lost4,reserve4));
        int n5 = 18;
        int[] lost5 = {7,8,11,12};
        int[] reserve5 = {1,6,8,10};
        // return 17;
        System.out.println(solution(n5,lost5,reserve5));
        int n6 = 24;
        int[] lost6 = {12, 13, 16, 17, 19, 20, 21, 22};
        int[] reserve6 = {1,22, 16, 18, 9, 10};
        System.out.println(solution(n6,lost6,reserve6));
        //return 19
//        System.out.println(solution(7, new int[]{2,3,4}, new int[]{1,2,3,6}));
        int n7 = 3;
        int[] lost7 = {1,2};
        int[] reserve7 = {2,3};
        // return 2;
        System.out.println(solution(n7,lost7,reserve7));
        int n8 = 5;
        int[] lost8 = {2,4};
        int[] reserve8 = {3,1};
        System.out.println(solution(n8,lost8,reserve8));
    }

    public static int solution(int n, int[] lost, int[] reserve){
        int answer = n-lost.length;

        lost = sort(lost);

        System.out.println();
        reserve = sort(reserve);

        System.out.println();
        for(int i = 0; i<lost.length; i++){
            for(int j = 0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer += 1;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for(int i = 0; i<lost.length; i++){
            for(int j = 0; j<reserve.length; j++){
                if(reserve[j] != -1 && (lost[i] -1 == reserve[j] || lost[i]+1 == reserve[j])){
                    answer += 1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }

    public static int[] sort(int[] array){
        int min,temp;
        for(int i = 0; i<array.length; i++){
            min = i;
            for(int j = i; j<array.length; j++){
                if(array[min] > array[j] ) min = j;
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }
}
