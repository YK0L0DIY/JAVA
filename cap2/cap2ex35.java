import java.util.Scanner;

public class cap2ex35 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("write your name like in the next format [forst middle last]: ");
        String name1=input.next(),name2=input.next(),name3=input.next();
        name2=name2.substring(0,1);
        System.out.println(name3+", "+name1+" "+name2+".");
    }
}
