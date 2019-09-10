package backjoon.ch04;

public class Question1110 {
    public static void main(String[] args){
        int n = new java.util.Scanner(System.in).nextInt(),added,a,b,cycle = 0;
        long start,end;
        for(int i = 0; i<=99; i++){
            cycle = 0;
            start = System.currentTimeMillis();
            n = i;

            if(n >= 10){
                a = n/10;
            }else{
                a = 0;
            }
            b = n%10;

            do{
                added = a+b;
                a = b;
                b = added%10;
                cycle ++;
            }while ((a*10+b) != n);
            end = System.currentTimeMillis();
            System.out.println(i +"= cycle : "+cycle+" time : "+(end - start)/1000.0);
        }

//        if(n >= 10){
//            a = n/10;
//        }else{
//            a = 0;
//        }
//        b = n%10;
//
//        do{
//            added = a+b;
//            a = b;
//            b = added%10;
//            cycle ++;
//        }while ((a*10+b) != n);
//
//        System.out.print(cycle);
    }
}
