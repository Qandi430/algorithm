package basic.BasicAlgorithm;

import basic.dataStructure.LinearQueue;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RadixSort {
    /**
     *      기수정렬(Radix Sort)
     *      기수정렬은 낮은 자리수부터 비교하여 정렬해 간다는 것을 기본 개념으로 하는 정렬 알고리즘
     *      기수정렬은 비교연산을 하지 않으며 정렬속도가 빠르지만 전체 크기에 기수 테이블의 크기만한 메모리가 더 필요
     *
     *      정렬방식
     *      1. 0~9 까지의 Bucket(Queue 자료구조의)을 준비한다.
     *      2. 모든 데이터에 대하여 가장 낮은 자리수에 해당하는 Bucket에 차례대로 데이터를 둔다.
     *      3. 0부터 차례대로 버킷에서 데이터를 다시 가져온다
     *      4. 가장 높은 자리수를 기준으로 하여 자리수를 높여가며 2번 3번 과정을 반복
     *
     *      특징
     *      1. 시간 복잡ㅂ도는 O(dn)
     *      2. 자리수가 고정되어 있어서 안정성이 있는 정렬방식
     */

    public void radixSort(int[] data){
        int maxSize = getMaxlength(data);
        ArrayList<LinearQueue> bucket = new ArrayList<>();
        int powed = 1;
        int index = 0;

        for(int i = 0; i<10; i++){      //버킷생성
            bucket.add(new LinearQueue(10));
        }

        for(int i = 1; i<=maxSize; i++){
            for(int j = 0; j<data.length; j++){
                bucket.get((data[j]/powed)%10).enQueue(data[j]);    //각 자리수에 맞는 index의 bucket에 넣는다
            }
            for(int k = 0; k<10; k++){
                int bucketNum = bucket.get(k).getRear();
                for(int n = 0; n <= bucketNum; n++){
                    data[index] = bucket.get(k).deQueue();
                    index++;
                }
            }
            index = 0;
            powed *=10;
        }
    }

    public int getMaxlength(int[] data){
        int maxSize = 0;
        for(int i = 0; i<data.length; i++){
            int length = (int)Math.log10((double)data[i]+1);
            if(maxSize < length){
                maxSize = length;
            }
        }
        return maxSize;
    }

}
