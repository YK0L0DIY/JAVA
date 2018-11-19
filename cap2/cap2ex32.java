import galapagos.Turtle;

import java.awt.*;

public class cap2ex32 {
    public static void main(String[] args){
    Turtle turtle = new Turtle();
    turtle.bodyColor(Color.black);
    turtle.penColor(Color.black);
    turtle.speed(100);
    turtle.moveTo(100,0);
    turtle.moveTo(100,-75);
    turtle.moveTo(0,-75);
    turtle.moveTo(0,0);
    turtle.jumpTo(10,-10);
    turtle.moveTo(90,-10);
    turtle.moveTo(90,-65);
    turtle.moveTo(10,-65);
    turtle.moveTo(10,-10);
    turtle.jumpTo(20,-20);
    turtle.moveTo(80,-20);
    turtle.moveTo(80,-55);
    turtle.moveTo(20,-55);
    turtle.moveTo(20,-20);
}
}
