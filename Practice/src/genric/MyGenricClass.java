package genric;

import java.util.ArrayList;

public class MyGenricClass {

    public MyGenricClass(){

        TypeGenric<Integer> integerTypeGenric = new TypeGenric<Integer>(15);

        System.out.println(integerTypeGenric.getTypeObject());


        System.out.println("calling from genric method "+genricMethod(new TypeGenric<String>("Santosh")).getTypeObject());
    }


    <T> T genricMethod(T elemnt){
        return elemnt;
    }
}


/**
 *  Type Genric
 * @param <T>
 */
class TypeGenric<T>{

    T object;

    public TypeGenric(T object){
        this.object=object;
    }

    public T getTypeObject(){
        return this.object;
    }
}


