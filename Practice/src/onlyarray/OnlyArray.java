package onlyarray;

import java.util.*;
import java.util.stream.Collectors;

public class OnlyArray {

    public OnlyArray(){
       removeDuplicateFromArray();
    }
//
//    {
//        System.out.println("instance block");
//    }
//    static {
//        System.out.println("static block");
//    }

    public static void main(String[] args) {
        OnlyArray onlyArray = new OnlyArray();
        onlyArray.removeDuplicateFromArray();

//        OnlyArray.main("dsfsd");
    }

    public static void main(String args)
    {
        System.out.println('J'+'A'+'V'+'A');
    }





    private void removeDuplicateFromArray(){
        int [] a = {1,5,2,6,4};
        List<Integer> a1 = Arrays.asList(1,2);

        //TODO: convert into Arraylist
        ArrayList<Integer> a2 = Arrays.stream(a).boxed().collect(Collectors.toCollection(ArrayList::new));

        System.out.println(a2);

//        a2.stream().collect(Collectors.toMap(integer -> integer.));



        //TODO: using hashmap

        int arrayWithDuplicates[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };

        //create a hashmap having integer type of key-value
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();

        //use for loop to pull the elements of array to hashmap's key
        for (int j = 0; j < arrayWithDuplicates.length; j++) {
            hashmap.put(arrayWithDuplicates[j], j);
        }
        // use hashmap.keySet() for printing all keys of hashmap using it's keySet() method
        System.out.println(hashmap.keySet());

        hashmap.forEach((integer, integer2) -> {
            System.out.println(integer +" "+integer2);
        });

        for (int i = 0; i<hashmap.size();i++){

        }


        //TODO:
    }

}

