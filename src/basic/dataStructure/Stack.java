package basic.dataStructure;

public class Stack {
    /**
     *      스택(Stack)
     *
     *      스택(stack)은 한 쪽 끝에서만 자료를 넣거나 뺄수 있는 선형구조(LIFO - Last In First Out)으로 되어있다
     *      자료를 넣는것을 PUSH 자료를 뺴는것을 POP 이라 한다.
     *
     */

    int maxSize = 0;
    int top = 0;
    int[] stack;

    public Stack(int maxSize){      //생성자에서 스택 사이즈 지정
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    public void Push(int number){ //push 데이터 삽입 maxSize 보다 작을 경우
        if(top < maxSize){
            stack[top] = number;
            top++;
        }else{
            System.out.println("stack over flow");
        }
    }

    public Object Pop(){          //top이 가르키는 위치의 원소를 반호나
        if(top > 0){
            return stack[--top];
        }else{
            System.out.println("Empty stack");
            return null;
        }
    }

    public static void main(String[] args){
        Stack stack = new Stack(5);
        stack.Push(5);
        stack.Push(4);
        stack.Push(3);
        stack.Push(2);
        stack.Push(1);
        stack.Push(1);
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
    }

}
