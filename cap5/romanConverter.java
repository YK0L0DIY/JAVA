package cap5;

import java.util.Scanner;

public class romanConverter {
    public static void main(String[] args){
        int year=0;

        System.out.println("Your Year:");
        Scanner input =new Scanner(System.in);
        String roman=input.nextLine();
        roman+="  ";

        for(int i=0;i<roman.length();i++){
            switch (roman.substring(i,i+1)){
                case "I":
                    if (roman.substring(i+1,i+2).equals("X")){
                        year+=9;
                        i++;
                        break;
                    }else if(roman.substring(i+1,i+2).equals("V")){
                        year+=4;
                        i++;
                        break;
                    }else{
                        year+=1;
                        break;
                    }

                case "V":
                    year+=5;
                    break;

                case "X":
                    if (roman.substring(i+1,i+2).equals("L")){
                        year+=40;
                        i++;
                        break;
                    }else if(roman.substring(i+1,i+2).equals("C")){
                        year+=90;
                        i++;
                        break;
                    }else{
                        year+=10;
                        break;
                    }

                case "L":
                    year+=50;
                    break;

                case "C":
                    if (roman.substring(i+1,i+2).equals("D")){
                        year+=400;
                        i++;
                        break;
                    }else if(roman.substring(i+1,i+2).equals("M")){
                        year+=900;
                        i++;
                        break;
                    }else{
                        year+=100;
                        break;
                    }

                case "D":
                    year+=500;
                    break;

                case "M":
                    year+=1000;
                    break;
            }
        }
        System.out.println(year);
    }
}
