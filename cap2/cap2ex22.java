import javax.swing.*;
import java.util.Scanner;

public class cap2ex22 {
    public static void main(String[] args){
        JFrame windows=new JFrame();
        Scanner input=new Scanner(System.in);
        String w =input.next();
        String h=input.next();
        int wH=Integer.parseInt(w);
        int hH=Integer.parseInt(h);
        windows.setSize(wH,hH);
        windows.setTitle("Welcome to java");
        windows.setVisible(true);

    }
}
