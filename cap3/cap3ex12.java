package cap3;


import java.util.Scanner;

public class cap3ex12 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("height(cm): ");
        double height=input.nextDouble();
        System.out.print("weight(kg): ");
        double weight=input.nextDouble();
        double BMI=weight/Math.pow((height/100.0),2);
        System.out.println("BMI: "+BMI);
        if(BMI>= 20 && BMI<=25){
            System.out.println("Normal");
        }
        else {
            System.out.println("You are fat");
        }
    }
}
