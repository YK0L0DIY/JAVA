package cap4;

import java.util.Scanner;

public class cap4ex6 {
    public static void main(String[] args){
        double numberOfA_Seats,numberOfB_Seats,numberOfC_Seats,priceOfA_Seat,priceOfB_Seat,priceOfC_Seat,totalSales;
        priceOfA_Seat=20;
        priceOfB_Seat=40;
        priceOfC_Seat=69;
        Scanner input=new Scanner(System.in);
        System.out.print("Number of A tickets sold: ");
        numberOfA_Seats=input.nextDouble();
        System.out.print("Number of B tickets sold: ");
        numberOfB_Seats=input.nextDouble();
        System.out.print("Number of C tickets sold: ");
        numberOfC_Seats=input.nextDouble();
        totalSales=priceOfA_Seat*numberOfA_Seats+priceOfB_Seat*priceOfB_Seat+numberOfC_Seats*priceOfC_Seat;
        System.out.println("Total Sales: "+totalSales);
    }
}
