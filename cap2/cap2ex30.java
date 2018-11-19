import galapagos.Turtle;

import java.awt.*;

public class cap2ex30 {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.bodyColor(Color.black);
        turtle.penColor(Color.black);
        turtle.turn(-54);
        for(int i=0; i!=5 ;i++){
            turtle.move(50);
            turtle.turn(180-36);
            turtle.move(50);
            turtle.turn(-180+108);

        }
    }

}
