
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)  {
//        Streams streams = new Streams();

//        OnlyArrayProgram onlyProgram = new OnlyArrayProgram();

//        Strings strings = new Strings();

//        new MyFiles();

//        MyException myException = new MyException();

//        new MyGenricClass();

//        new MyFunctionalInterface();

//        testProgram();

//        interviewProgram();

//        uppercase();

        subStringIssue();
    }


    private static void subStringIssue(){
        String s = new String(new byte[1000]);
//        s = "santosh";

        String substr = s.substring(0, 2);

        System.out.println(substr);
        


//        String s1 = "java is a program";
//
//
//        Map.Entry<Character,Long> sss = s1.chars().mapToObj(value -> (char)value)
//               .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
//                       .entrySet().stream().filter(stringLongEntry -> stringLongEntry.getValue() == 1L)
//                       .findFirst().get();
//
//        System.out.println(sss);

//                .entrySet().stream().map()
//                .

//        byte[] b = s.getBytes(StandardCharsets.UTF_8);
//        for (byte b1 : b) {
//            System.out.println(b1);
//
//        }


        arrayPro();
    }




    private static void arrayPro(){

        int a[] = {1, 1, 2, 2, 3, 4, 4, 5, 5};

       Integer intNumber = Arrays.stream(a).boxed()
               .collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()))
                .entrySet()
                .stream().filter(integerLongEntry -> integerLongEntry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().get();


        System.out.println("output => "+intNumber);

    }


    private static void uppercase(){
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date");

        stringList.stream().map(String::toUpperCase).forEach(System.out::println);


        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer evenNumSum = integerList.stream().filter(integer -> integer % 2 == 0).mapToInt(Integer::intValue).sum();

        System.out.println("evenNUmberSum ="+evenNumSum);
    }


    interface A{

        public abstract void a();
    }

    private static void interviewProgram(){
        int n = 159;
        int digit = 5;
        int h = 0;
        for(int i=n;i>0;i--){
            if (h > i)
                break;
            if(!String.valueOf(i).contains(String.valueOf(digit)) && h < i){
                h = i;
            }
        }
        System.out.println("number is = "+h);
    }

    private static void interviewProgram2(){
        String s = "race";
        String s1 = "raca";

        char [] c = s.toCharArray();
        char [] c1 = s1.toCharArray();

        Arrays.sort(c);
        Arrays.sort(c1);

        int count = 0;
        for(int i=0;i<c.length;i++){
            if(c[i] != c1[i]){
                count++;
            }
        }

        if(count > 1){
            System.out.println("not a anagram");
        }else{
            System.out.println("Anagram");
        }
    }


    //145  4
    private static void testProgram(){

        int [] a =  {4,8,6,3,2};
        int [] b = new int[a.length+1];

        int h = 0;
        int secBigNumber = 0;
        int k = 0;

        for (int i=0;i<a.length;i++){
            if (h < a[i]){
                h = a[i];
                secBigNumber = a[i+1];
            }
        }

        for (int i=0;i<a.length;i++){
            if (h == a[i]){
                b[k++] = secBigNumber;
                b[k++] = h-secBigNumber;
            }else {
                b[k++] = a[i];
            }
        }


        for (int i =0;i<b.length;i++){
            System.out.print(" "+b[i]);
        }
    }
}

