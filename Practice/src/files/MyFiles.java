package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFiles {

    public MyFiles(){
        writeIntoFile();
        readFromFile();
    }


    private void writeIntoFile(){

        File file = new File("C:\\Users\\Mobile Programming\\Documents\\demo1.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("santosh");
            fileWriter.close();
            System.out.println("file successfully write");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void readFromFile(){
        File file = new File("C:\\Users\\Mobile Programming\\Documents\\demo1.txt");
        try {
            FileReader fileReader = new FileReader(file);
            int i;
            while ((i=fileReader.read()) != -1){
                System.out.print((char)i);
            }
        }catch (Exception e){
        }
    }
}
