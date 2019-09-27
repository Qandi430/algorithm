package backjoon.ch11;

import java.io.*;

public class Question2108 {
    private static int size;
    private static int[] array;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        size = Integer.parseInt(br.readLine());
        array = new int[size];
        int middle,second,range;
        double average = 0;

        for(int i = 0; i<size; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        quickSort(array,0,array.length-1);

        for(int i = 0; i<size; i++){
            average += array[i];
        }

    }



    public static int[] quickSort(int[] data, int left, int right){
        int pivotIndex = left;
        int pivot = data[pivotIndex];
        int holdLeft = left;
        int holdRight = right;

        left ++;

        while(right >= left){
            while(left <= right && data[left] <= pivot){
                left++;
            }
            while(data[right] >= pivot && left <= right)
                right --;
            if(left <= right){
                int tmp = data[left];
                data[left] = data[right];
                data[right] = tmp;
            }
        }

        int tmp = data[pivotIndex];
        data[pivotIndex] = data[right];
        data[right] = tmp;

        if(right > holdLeft)
            data = quickSort(data,holdLeft,right-1);
        if(holdRight > right)
            data = quickSort(data,right+1,holdRight);

        return data;
    }

}
