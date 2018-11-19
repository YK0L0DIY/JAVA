
package cap3;

import galapagos.Turtle;

import java.awt.*;
import java.util.Scanner;

public class cap3ex31 {
    public static void main(String[] args) {
        Turtle turtul = new Turtle();
        turtul.penColor(Color.black);
        turtul.bodyColor(Color.black);
        turtul.speed(100);
        Scanner input = new Scanner(System.in);
        System.out.print("base= ");
        double base1 = input.nextDouble();
        System.out.print("height= ");
        double height1 = input.nextDouble();
        double height2, height3, base2, base3;
        height2 = height1 + height1 * 0.4;
        height3 = height1 + height1 * 0.8;
        base2 = base1 + base1 * 0.4;
        base3 = base1 + base1 * 0.8;
        turtul.move(base1);
        turtul.turn(90);
        turtul.move(height1);
        turtul.turn(90);
        turtul.move(base1);
        turtul.turn(90);
        turtul.move(height1);
        turtul.turn(90);
        turtul.move(base2);
        turtul.turn(90);
        turtul.move(height2);
        turtul.turn(90);
        turtul.move(base2);
        turtul.turn(90);
        turtul.move(height2);
        turtul.turn(90);
        turtul.move(base3);
        turtul.turn(90);
        turtul.move(height3);
        turtul.turn(90);
        turtul.move(base3);
        turtul.turn(90);
        turtul.move(height3);
        turtul.turn(90);


    }
}
