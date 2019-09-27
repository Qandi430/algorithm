package backjoon.ch11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question2751 {
    private static int[] array;
    private static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        size = Integer.parseInt(br.readLine());
        array = new int[size];

        for(int i = 0; i<size; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        Heap heap = new Heap(array,size);

        heap.heapSort();
    }

}

    class Heap{
        int heapSize;
        int[] data;

        public Heap(int[] data, int heapSize){
            this.heapSize = heapSize;
            this.data = data;
        }

        public void heapSort(){
            for(int i = heapSize/2; i>=0; i--){
                minHeapfiy(i);
            }
            for(int i = 0; i<data.length; i++){
                System.out.println(downHeap());
            }
        }

        public void minHeapfiy(int i){
            int leftNode = i*2+1;
            int rightNode = i*2+2;
            int min;

            if(leftNode < heapSize){
                if(data[leftNode] < data[i]){
                    min = leftNode;
                }else{
                    min = i;
                }
            }else{
                return;
            }

            if(rightNode < heapSize){
                if(data[rightNode] < data[min]){
                    min = rightNode;
                }
            }

            if(min != i){
                swap(min, i);
                minHeapfiy(min);
            }
        }

        public int downHeap(){
            int min = data[0];
            data[0] = data[--heapSize];
            minHeapfiy(0);
            return min;
        }

        public void swap(int min, int i){
            int tmp = data[min];
            data[min] = data[i];
            data[i] = tmp;
        }
    }