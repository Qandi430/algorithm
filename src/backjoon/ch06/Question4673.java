package backjoon.ch06;

public class Question4673 {
    public static void main(String[] args){
        int[] array = new int[10001];
        int cal,devide;

        for(int i = 1; i<=10000; i++){
            devide = i;
            cal = i;
            while(true){
                if(devide >= 10000){
                    cal += devide/10000;
                    devide = devide%10000;
                }else if(devide >= 1000){
                    cal += devide/1000;
                    devide = devide%1000;
                }else if(devide >= 100){
                    cal += devide/100;
                    devide = devide%100;
                }else if(devide >= 10){
                    cal += devide/10;
                    devide = devide%10;
                }else{
                    cal += devide;
                    break;
                }
            };
            if(cal <= 10000) array[cal] = 1;
        }

        for(int i = 1; i<=10000; i++){
            if(array[i]==0) System.out.println(i);
        }
    }

//    public static int calculate(int num){
//        int devide = num;
//        int cal = num;
//        while(true){
//            if(devide >= 10000){
//                cal += devide/10000;
//                devide = devide%10000;
//            }else if(devide >= 1000){
//                cal += devide/1000;
//                devide = devide%1000;
//            }else if(devide >= 100){
//                cal += devide/100;
//                devide = devide%100;
//            }else if(devide >= 10){
//                cal += devide/10;
//                devide = devide%10;
//            }else{
//                cal += devide;
//                break;
//            }
//        };
//        return cal;
//    }

}
