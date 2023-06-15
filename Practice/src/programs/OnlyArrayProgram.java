package programs;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OnlyArrayProgram {

    int[] s = new int[5];

    int[] a = {10,10,20,30,30,40,40,50};

    int[] b = {1,2,3,4,5,6,4};

    public OnlyArrayProgram(){

//        sumOfArray();
//        sumOfArrayIndex();
//        findTargetfromArray();

        findHighestAndSecHighest();
    }

    private void sumOfArray(){
        int sum = 0;
        for (int i=0;i<a.length;i++){
            sum = sum+a[i];
        }
        System.out.println("sum of array = "+sum);
    }
    private void sumOfArrayIndex(){
        int sum = 0;
        int sumNum = 7;
        int[] index = new int[10];

        int k =0;
//        for (int i=0;i<b.length-1;i++){
//            if (b[i] + b[i+1] == sumNum){
//                index[k++] = i;
//                index[k++] = i+1;
//            }
//        }


        // length = 7
        // i will be 0 < 7-1 => 0 to 5
        // j will be i+1 to 6

        //TODO: if we have multiple item which can match
        for (int i=0;i<b.length-1;i++){
            for (int j=i+1;j<b.length;j++) {
                if (b[i] + b[j] == sumNum) {
                    index[k++] = i;
                    index[k++] = j;
                }
            }
        }


        for (int i=0;i<index.length;i++){
            if (index[i] != 0)
                System.out.println("sum element = "+b[index[i]]+" " +"index = "+index[i]+" index of index = "+i);
        }
    }

    private void findTargetfromArray(){
        OptionalInt optionalInt = Arrays.stream(b).filter(value -> value == 5).findFirst();
        System.out.println("through the stream == "+optionalInt.getAsInt());


        //TODO: Find Index of target value
        int index = IntStream.range(0,b.length)
                .filter(value -> Objects.equals(b[value],4))
                .findFirst().getAsInt();
        System.out.println(index);


        int i =0;
        for (int bc : b){
               if (bc == 4){
                   System.out.println("using array == "+bc+" index = "+i);
               }
               i++;
        }
    }

    private void findHighestAndSecHighest(){
        int []  a = {1,15,4,7,9,10};

        int hNumber = 0;
        int secHNumber = 0;
        int tHNumber = 0;

        for (int i=0;i<a.length;i++){
            if (hNumber < a[i]){
                tHNumber = secHNumber;
                secHNumber =hNumber;
                hNumber = a[i];
            }

            if (hNumber > a[i] && secHNumber < a[i]){
                secHNumber = a[i];
            }
        }

        for (int i=0;i<a.length;i++){
            if (secHNumber > a[i] && tHNumber  < a[i]){
                tHNumber = a[i];
            }
        }
        System.out.println("highest num "+hNumber+" "+secHNumber+" "+tHNumber);
    }
}

