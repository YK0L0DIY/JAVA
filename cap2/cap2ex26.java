import java.util.Scanner;

public class cap2ex26 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("your String: ");
        String your_string=input.nextLine();
        String str1=your_string.substring(0,your_string.indexOf("!"));
        String str2=your_string.substring(your_string.indexOf("!")+1);
        System.out.println(str1);
        System.out.println(str2);
    }
}
