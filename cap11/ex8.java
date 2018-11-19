package cap11;

import java.util.Scanner;

public class ex8 {

    public static void bubbleSort(String[] strings) {
        int bottom;
        boolean exchanged = true;
        bottom = strings.length - 2;
        while (exchanged) {
            exchanged = false;
            for (int i = 0; i <= bottom; i++) {

                if (strings[i].compareToIgnoreCase(strings[i + 1]) > 0) {
                    String temp = strings[i];
                    strings[i] = strings[i + 1];
                    strings[i + 1] = temp;
                    exchanged = true;

                }
            }
            /*assert maxBottom(number, bottom) :
                    "Error: " + number[bottom] +
                            " at position " + bottom +
                            " is not the largest.";*/
            bottom--;
        }
        /*assert isSorted(number) : "Error: the final is not sorted";*/
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("how many: ");
        int many=input.nextInt();

        String[] myArray = new String[many];
        int x = 0;

        while (x!=many) {
            myArray[x] = input.next();
            x++;
        }

        bubbleSort(myArray);

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
    }
}
