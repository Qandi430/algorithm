package backjoon.ch11;

public class Question1427 {
    public static void main(String[] args){
        String input = new java.util.Scanner(System.in).nextLine();
        int[] array = new int[input.length()];
        String result = "";
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(input.split("")[i]);
        }

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int a :array){
            result += a;
        }

        System.out.println(result);
    }
}
