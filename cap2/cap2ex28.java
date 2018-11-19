import java.util.Scanner;

public class cap2ex28 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Your string: ");
        String your_string=input.nextLine();
        int numberOfStrings=your_string.length();
        System.out.println(your_string.substring(numberOfStrings/2,numberOfStrings/2+1));
    }
}
