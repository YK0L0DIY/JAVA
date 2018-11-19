package cap3;


import java.util.Scanner;

public class cap3ex10 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        float f=input.nextFloat();
        float c=(5.0f/9)*(f-32);
        System.out.println("Celsius: "+c);
    }
}
