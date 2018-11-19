import galapagos.Turtle;

import java.awt.*;

public class cap2ex29 {
    public static void main(String[] args){
        Turtle turtle=new Turtle();
        turtle.bodyColor(Color.red);
        turtle.penColor(Color.blue);
        turtle.move(50);
        turtle.turn(90+45);
        double comp = Math.sqrt(5000);
        turtle.move(comp);
        turtle.turn(45+90);
        turtle.move(50);



    }
}
