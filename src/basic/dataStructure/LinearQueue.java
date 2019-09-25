package basic.dataStructure;

public class LinearQueue {
    /**
     *      선형 큐(Linear Queue)
     *
     *      큐는 가장 먼저 들어온 데이터가 가장 먼저 내보내지는 (FIFO = First In First Out) 구조
     *      선형 큐는 데이터를 집어넣는 Enqueue 기능과 데이터를 내보내는 Dequeue 기능을 제공
     *
     *      front = 큐의 첫번째 데이터
     *      rear = 큐의 마지막 데이터
     *
     *      선형 큐의 문제점
     *      일반적인 선형 큐는 rear가 마지막 index를 가리키면서 데이터 삽입이 이루어짐
     *      문제는 rear가 배열의 마지막 인덱스를 가르키게 되면 앞에 남아있는 (삽입 중간에 Dequeue 되어 비어있는 공간) 공간을 활욜 할 수 없게 됨
     *      이 방식을 해결하기 위해선 Dequeue할때 front를 고정시킨채 뒤에 남아있는 데이터를 앞으로 당겨야 함
     */

    int rear = -1;      //초기 rear는 -1
    int front = 0;
    int maxSize = 0;
    int[] linearQueue;

    public LinearQueue(int maxSize){
        this.maxSize = maxSize;
        linearQueue = new int[maxSize];
    }

    public void enQueue(int num){
        if(rear != maxSize-1){
            linearQueue[++rear] = num;
        }else{
            System.out.println("Full Queue");
        }
    }

    public int deQueue(){
        if(rear != front || (rear == 0 && front==0)){
            int tmp = linearQueue[front];
            for(int i = 1; i<=rear; i++){
                linearQueue[i-1] = linearQueue[i];
            }
            rear --;
            return tmp;
        }else{
            return -1;
        }
    }

    public static void main(String[] args){
        LinearQueue linearQueue = new LinearQueue(5);

        linearQueue.enQueue(5);
        linearQueue.enQueue(4);
        linearQueue.enQueue(3);
        linearQueue.enQueue(2);
        linearQueue.enQueue(1);

        System.out.println(linearQueue.deQueue());
        System.out.println(linearQueue.deQueue());
        System.out.println(linearQueue.deQueue());
        System.out.println(linearQueue.deQueue());
        System.out.println(linearQueue.deQueue());
    }
}
