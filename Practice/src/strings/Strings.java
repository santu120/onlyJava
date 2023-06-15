package strings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Strings {

    public Strings(){
//        reverseString();
//        System.out.println("\n");
//        stringManupulation();
//        findAElement();

//        printAsciiValue();

//        reverseWordInASentences();

//        countRepeatedChar();

        perfectMatch();
    }



    private void perfectMatch(){

    }




    private void stringManupulation(){

        String s = "santosh";

        byte[] b = s.getBytes();

        for (byte b1 : b){
            System.out.println("byte output => "+b1 +" coresposnding char "+(char)b1);
        }
    }

    private void reverseString(){

        String s = "santosh";

        //TODO: one way
        for (int i=0;i<s.length();i++){
            System.out.print(s.charAt(s.length() - (i+1)));
        }


        System.out.println("\n============  second way ============");
        //TODO: second way
        for (int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }

    }

    private void findAElement(){

        //TODO: Using stream
        List<String>  strings =  Arrays.asList("santosh","sumant","rahul");
        strings.stream().filter(s -> s.startsWith("s")).forEach(System.out::print);

        List<Integer> integerList = Arrays.asList(2,3,43,5,4,45);

        integerList.stream().filter(integer -> integer.toString().startsWith("4"))
                .forEach(System.out::println);
    }

    private void printAsciiValue(){
        for (int i=0;i<255;i++){
            System.out.println("ASCII value of "+(char)i+" "+i);
        }
    }

    private void reverseWordInASentences(){
        String s = "java is a programming language";

        String[] split = s.split("\\s");

        StringBuffer stringBuffer = new StringBuffer();

        for (int i=0;i<split.length;i++){
            for (int j=0;j<split[i].length();j++) {
                stringBuffer.append(split[i].charAt(split[i].length()-1 - j));
            }
            stringBuffer.append(" ");
        }

        System.out.println(s);
        System.out.println(stringBuffer);


        //Using stream
        Arrays.stream(s.split("\\s")).map(s1 -> new StringBuffer(s1).reverse()).forEach(System.out::println);
    }


    private void countRepeatedChar(){

        String s = "asa asa";

        //using Loops

        Map<String,Long> map = s.chars().mapToObj(value -> (char)value).filter(character -> !character.equals(' ')).collect(Collectors.groupingBy(Objects::toString,Collectors.counting()));

        System.out.println(map);


        //todo:

        char [] c = s.toCharArray();
        for (int i=0;i<c.length;i++){
            int count = 1;
            if (c[i] != ' ') {
                for (int j = i+1; j < c.length; j++) {
//                    if (c[j] != ' ' && c[i] != '0') {
                        if (c[i] == c[j]) {
                            c[j] = '0';
                            count++;
                        }
//                    }
                }
                if (c[i] != '0')
                    System.out.println(c[i] + "  ===> " + count);
            }
        }
    }

}
