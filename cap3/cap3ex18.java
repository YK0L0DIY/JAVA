package cap3;


import java.util.Scanner;

public class cap3ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.print("a=");
        a = input.nextDouble();
        System.out.print("b=");
        b = input.nextDouble();
        System.out.print("c=");
        c = input.nextDouble();
        if ((Math.pow(b, 2) >= (4 * a * c)) && a != 0) {
            double x = (-b + Math.sqrt(Math.pow(b, 2) -4*a*c))/2*a;
            double x2 =(-b - Math.sqrt(Math.pow(b, 2) -4*a*c))/2*a;
            System.out.println("x="+x+"or x="+x2);
        }
        else {
            System.out.print("Impossivel");
        }

    }
}
