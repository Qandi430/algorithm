package basic.BasicAlgorithm;

public class HeapSort {
    /**
     *      힙 정렬(Heap Sort)
     *      힙 정려은 힙 자료구조를 기반으로 원소들을 정렬하는 방식을 의미
     *
     *      정렬과정
     *      1. 배열에 저장된 원소들을 최대힙으로 구성
     *      2. 루트 노드에 존재하는 값을 가지고오고, 가장 말단에 있는 노드를 루트 노드에 위치시킨다.
     *         새로 자리 자은 루트 노드에 대하여 다시 힙 성질에 맞게끔 배열을 조정(Down Heap 과정)
     *      3. 배열에 남아있는 원소가 없을때 까지 2번 과정을 반복
     */

    int heapSize;
    int[] data;

    public HeapSort(int[] data, int heapSize){
        this.heapSize = heapSize;
        this.data = data;
    }

    public void heapSort(){
        for(int i = heapSize/2; i>=0 ;i--){
            maxHeapfiy(i);
        }
        for(int i = 0; i<data.length; i++){
            System.out.println(downHeap());
        }
    }

    public void maxHeapfiy(int i){
        int leftNode = i*2+1;       //왼쪽 자식 노드의 인덱스
        int rightNode = i*2+2;      //오른쪽 자식 노드의 인덱스
        int max;

        if(leftNode < heapSize){    //왼쪽 자식 노드가 존재하는 경우
            if(data[leftNode] > data[i]){   //왼쪽 자식 노드가 부모 노드보다 큰 경우
                max = leftNode;
            }else{
                max = i;
            }
        }else{      //왼쪽 자식 노드가 없으면 리턴
            return;
        }

        if(rightNode < heapSize){   //오른쪽 자식 노드가 있는 경우
            if(data[rightNode] > data[max]){
                max = rightNode;
            }
        }

        if(max != i){   //기존 부모 노드보다 큰값이 자식 노드에 있는 경우
            swap(max,i);
            maxHeapfiy(max);
        }
    }

    public int downHeap(){
        int max = data[0];              //루트 노드를 저장
        data[0] = data[--heapSize];     //말단 노드를 루트 노데으 위치 시키고 힙의 크기를 -
        maxHeapfiy(0);               //루트 노드에 대한 최대 힙화;
        return max;
    }

    public void swap(int max,int i){
        int tmp = data[max];
        data[max] = data[i];
        data[i] = tmp;
    }
}
