package cap12;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        try {
            File myFile  = new File("firstFile");

            FileOutputStream myFileStream = new FileOutputStream(myFile);

            PrintWriter outStream=new PrintWriter(myFileStream);

            Scanner input=new Scanner(System.in);

            while (input.hasNext()) {
                String temp=input.next();
                if (temp.equalsIgnoreCase("STOP")){
                    break;

                }else{
                    outStream.println(temp);
                }
            }
            outStream.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
