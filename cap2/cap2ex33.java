import galapagos.Turtle;

import java.awt.*;

public class cap2ex33 {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.bodyColor(Color.black);
        turtle.penColor(Color.black);
        turtle.speed(100);
        turtle.print("Hello");
        turtle.jumpTo(-200,150);
        turtle.print("Hello");
        turtle.jumpTo(-200,-150);
        turtle.print("Hello");
        turtle.jumpTo(200,-150);
        turtle.print("Hello");
        turtle.jumpTo(200,150);
        turtle.print("Hello");
    }
}
