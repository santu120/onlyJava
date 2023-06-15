import javafx.util.Pair;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

interface A{
    void a(int a);
}

class A2{
    public static String a="parent class";
    public static String b;
}

public class Main extends A2 implements  A {

    public static String a = "child class";

    public static void systemA(){

    }

    public static void main(String[] args) {

        System.out.println(" ===> "+a);

//        sortCharacter();
//        checkStringIsOrder();

//        checkToString();

        sum2Number();
    }

    private static void sum2Number(){

        int a[] = {4,6,2,9,6};
        int target = 8;

        List<Integer> integersList = Arrays.asList(4,6,2,9,6);


        //TODO: sum of array
        int sum = integersList.stream().collect(Collectors.summingInt(Integer::intValue));

        System.out.println(sum);

        Set<Integer> numset = new HashSet<>();
        //TODO:
         Optional<Object> p= Arrays.stream(a).boxed().filter(integer -> {
            int comp = target-integer;
            return !numset.add(comp);
        }).findFirst().map(integer -> new Pair<>(integer,target-integer));


        System.out.println(p.isPresent() ? p.get() : "no present");
        System.out.println(numset);
    }



    private static void checkToString(){
        String s = "race";
        String a = "race";

        int count  = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) != a.charAt((i)) && count < 1){
                count++;
            }
        }

        if (count > 1){
            System.out.println("it's not matched");
        }else {
            System.out.println("it's matched");
        }

    }

    private static void sortCharacter(){
        String s = "race";
        String s1="";

        char[] c = s.toCharArray();

        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length();j++){
                if (s.charAt(i) > s.charAt(j)){
                    char temp = c[i];

                    c[i]=c[j];
                    c[j]=temp;

                }
            }
        }


        for (char c1 : c) {
            System.out.println(c);
        }



        //TODO: some of array using stream
        int [] a = {1,2,4,5,6};

        int sumArray = Arrays.stream(a).sum();
        System.out.println(sumArray);
    }


    private static void checkStringIsOrder(){
        String s="aabbcc";

        for (int i =1; i<s.length();i++){
            if (s.charAt(i) < s.charAt(i-1))
                System.out.println(" un ordered");
            else
                System.out.println("ordered");
        }

    }



    private void dunctionalInterface(){
        A a1 = (a)->{
            System.out.println("hello "+a);
        };
        a1.a(10);

        A a3 = new A(){
            @Override
            public void a(int a){

            }
        };

        a3.a(10);

        new Main().a(100);
    }


    private void program(){
        List<Integer> integers = new ArrayList<>(20000);


        String s = "This is a word, this is string";


        String[] split = s.split("\\s");

        for (int i=0;i<split.length;i++){
            int count =1;
            if (!split[i].equalsIgnoreCase("0")) {
                for (int j = i + 1; j < split.length; j++) {
                    if (split[i].equalsIgnoreCase(split[j])) {
                        count++;
                        split[j] = "0";
                    }
                }

                if (!split[i].equalsIgnoreCase("0"))
                    System.out.println(split[i] + " ===> " + count);
            }
        }
    }

    @Override
    public void a(int a) {

    }
}

