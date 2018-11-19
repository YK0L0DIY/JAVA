import java.util.Scanner;

public class cap2ex19 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String name1=input.next(),name2=input.next(),name3=input.next();
        name2=name2.substring(0,1);
        System.out.println(name1+" "+name2+". "+name3);
    }
}
