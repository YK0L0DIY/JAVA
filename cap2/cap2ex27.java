import java.util.Scanner;

public class cap2ex27 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String your_string=input.nextLine();
        int numberOfStrings=your_string.length();
        String str1=your_string.substring(0,1);
        String str2=your_string.substring(numberOfStrings-1);
        System.out.println(numberOfStrings);
        System.out.println(str1);
        System.out.println(str2);
    }
}
