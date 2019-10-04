package basic.BasicAlgorithm;

public class MergeSort {
    /**
     *      병합 정렬(Merge Sort)
     *      전체 원소를 하나의 단위로 분할 한 후에 분할한 원소를 다시 병합하며 정렬해가는 방식
     *
     *      정렬방식
     *      1. 정렬하고자 하는 데이터집합을 반으로 나눈다.
     *      2. 반으로 나누어진 하위 데이터 개수가 2이상이면 1의 과정을 반복
     *      3. 같은 집합에서 나온 하위 데이터 둘을 정렬을 시도하면서 다시 벼합
     *      4. 원래의 데이터 집합이 될때까지 3의 과정을 반복
     *
     *      특징
     *      1. 평균적으론나 최악의 경우에나 O(nlogn)의 복잡도를 갖는다.
     *      2. 정렬을 위해서는 O(n)의 추가적은 공간을 필요로 한다.
     *
     *
     */

    public static void main(String[] args){
        int[] array = {5,2,4,7,6,1,3,8};
        int[] result = mergeSort(array,0,array.length -1);

        for(int r : array){
            System.out.print(r+", ");
        }
    }

    public static int[] mergeSort(int[] data, int first, int last){
        System.out.print("first : "+first);
        System.out.print(" data : ");
        for(int d : data){
            System.out.print(d+" ");
        }
        System.out.println(" last : "+last+"\n");
        if(last>first){
            int middle = (first+last)/2;
            mergeSort(data,first,middle);
            mergeSort(data,middle+1,last);
            sort(data,first,middle,last);
        }
        return data;
    }

    public static void sort(int[] data,int first,int middle,int last){
        int[] tmpArray = new int[10]; //합병 정렬 임시 저장
        int leftStart = first;        //분열된 왼쪽배열 시작
        int tmpIndex = first;         //합병되는 배열의 시작
        int rightStart = middle+1;    //분열된 오른쪽 배열 시작

        while(leftStart <= middle && rightStart<=last){     //왼쪽 배열과 오른쪽 배열차례대로 비교하여 임시배열에 넣기
            if(data[leftStart] < data[rightStart]){         //왼쪽 배열의 원소가 작을 경우
                tmpArray[tmpIndex] = data[leftStart];
                leftStart++;
            }else{                                          //오른쪽 배열의 원소가 작을 경우
                tmpArray[tmpIndex] = data[rightStart];
                rightStart++;
            }
            tmpIndex ++;
        }

        while (leftStart <= middle){        //왼쪽배열에 아직 원소가 남은경우
            tmpArray[tmpIndex] = data[leftStart];
            leftStart ++;
            tmpIndex++;
        }

        while(rightStart <= last){          //오른쪽 배열에 원소가 남은경우
            tmpArray[tmpIndex] = data[rightStart];
            rightStart++;
            tmpIndex++;
        }

        for(int i =first; i<=last; i++){
            data[i] = tmpArray[i];
        }
    }
}
