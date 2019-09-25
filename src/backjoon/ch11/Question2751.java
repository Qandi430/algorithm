package backjoon.ch11;

import java.util.Scanner;

public class Question2751 {

    class Heap{
        int value;
        Heap left;
        Heap right;
        Heap head;

        public Heap(){}

        public Heap(int value) {
            this.value = value;
        }

        public void addHeap(int value){
            if(this.head == null){
                head = new Heap(value);
            }else{
                if(this.head.value > value){
                    if(this.head.left == null){
                        this.head.left = new Heap(value);
                    }else{
                        Heap parentHeap = findParentHeap(this.head.left);
                        if(parentHeap.left == null) parentHeap.left = new Heap(value);
                        else parentHeap.right = new Heap(value);
                    }
                }else{
                    if(this.head.right == null){
                        this.head.right = new Heap(value);
                    }else{
                        Heap parentHeap = findParentHeap(this.head.right);
                        if(parentHeap.left == null) parentHeap.left = new Heap(value);
                        else parentHeap.right = new Heap(value);
                    }
                }
            }
        }

        public Heap findParentHeap(Heap heap){
            if(heap.left == null){
                return heap;
            }else if(heap.right == null){
                return heap;
            }else{
                return findParentHeap(heap.left);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        Question2751 question  = new Question2751();
        Heap heap = question.new Heap();

        for(int i = 0; i<n; i++){
            heap.addHeap(sc.nextInt());
        }

    }
}
