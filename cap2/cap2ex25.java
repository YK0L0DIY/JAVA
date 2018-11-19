import javax.swing.*;

public class cap2ex25 {
    public static void main(String[] args){
        JFrame windows=new JFrame();
        windows.setTitle("Welcome to java");
        windows.setSize(800,600);
        windows.setVisible(true);
        try {
            Thread.sleep(500);
        }catch(Exception e){}

        windows.setVisible(false);
        try {
            Thread.sleep(500);
        }catch(Exception e){}

        windows.setVisible(true);

    }

}
