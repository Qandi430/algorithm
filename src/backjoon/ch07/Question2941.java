package backjoon.ch07;

public class Question2941 {
    public static void main(String[] args){
        String[] inputArray = new java.util.Scanner(System.in).next().split("");
        int index = 0;
        int result = 0;
        if(inputArray.length > 1){
            while (index < inputArray.length){
                if(!inputArray[index].equals("=")){
                    result ++;
                    if(index +1 < inputArray.length){
                        if(inputArray[index].equals("c")){
                            if(inputArray[index+1].equals("=") ||inputArray[index+1].equals("-")) index ++;
                        }else if(inputArray[index].equals("d")){
                            if(inputArray[index+1].equals("z")){
                                if(index+2 < inputArray.length){
                                    if(inputArray[index+2].equals("=")) index += 2;
                                }
                            }else if(inputArray[index+1].equals("-")) index ++;
                        }else if(inputArray[index].equals("l")){
                            if(inputArray[index+1].equals("j")) index ++;
                        }else if(inputArray[index].equals("n")){
                            if(inputArray[index+1].equals("j")) index ++;
                        }else if(inputArray[index].equals("s")){
                            if(inputArray[index+1].equals("=")) index ++;
                        }else if(inputArray[index].equals("z")){
                            if(inputArray[index+1].equals("=")) index ++;
                        }
                    }
                    index ++;
                }
            }
        }else{
            result = 1;
        }


        System.out.println(result);
    }
}

