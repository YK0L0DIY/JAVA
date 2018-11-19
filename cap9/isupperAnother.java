package cap9;

import java.util.Scanner;

public class isupperAnother {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int contador=0;
        String in;

        do{System.out.println("Your String:");
        in=input.nextLine();

        for(int i =0;i<in.length();i++){

            if(in.charAt(i)>='A' && in.charAt(i)<='Z'){
                contador++;
            }
        }

        System.out.println(contador);
        }while (in.charAt(0)==' ');
    }
}
