import java.text.SimpleDateFormat;
import java.util.Scanner;

public class cap2ex34 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("qual e a tua idade: ");
        String idade=input.next();
        int ano=Integer.parseInt(idade);
        ano=2018-ano;
        System.out.print("mes:");
        String mes=input.next();
        int mess=Integer.parseInt(mes);
        System.out.print("dia:");
        String dia=input.next();
        int day=Integer.parseInt(dia);
        SimpleDateFormat sdf;
        String data=String.format("%s-%s-%s" ,ano, mess, dia);
        java.util.Date dbate=java.sql.Date.valueOf(data);
        sdf =new SimpleDateFormat("EEEE");
        System.out.println(sdf.format(dbate));
    }
}
