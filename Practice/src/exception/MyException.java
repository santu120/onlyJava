package exception;

import java.io.*;

public class MyException {

    public MyException(){

        try {
            customException();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        try {
            myThrowException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void customException() throws FileNotFoundException {

        FileInputStream GFG
                = new FileInputStream("/Desktop/GFG.txt");

    }


    private void myThrowException() throws Exception {
        int a = 8;

        if (a != 8){
            throw new Exception("not valid number");
        }else {

        }
    }
}
