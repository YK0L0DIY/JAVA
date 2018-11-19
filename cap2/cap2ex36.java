import galapagos.Turtle;
import galapagos.TurtleDrawingWindow;

import java.awt.*;

public class cap2ex36 {
    public static void main(String[] args){

        Turtle turtle=new Turtle();
        turtle.penColor(Color.black);
        turtle.penColor(Color.black);
        turtle.speed(150);
        turtle.moveTo(150/2,0);
        turtle.moveTo(150/2,300/2);
        turtle.moveTo(-150/2,300/2);
        turtle.moveTo(-150/2,0);
        turtle.moveTo(0,0);
        turtle.jumpTo(-190/2,300/2);
        turtle.moveTo(190/2,300/2);
        turtle.moveTo(0,500/2);
        turtle.moveTo(-190/2,300/2);
        turtle.jumpTo(45/2,0);
        turtle.moveTo(45/2,170/2);
        turtle.moveTo(-45/2,170/2);
        turtle.moveTo(-45/2,0);
        turtle.jumpTo(90/2,150/2);
        turtle.moveTo(130/2,150/2);
        turtle.moveTo(130/2,190/2);
        turtle.moveTo(90/2,190/2);
        turtle.moveTo(90/2,150/2);
        turtle.jumpTo(-90/2,150/2);
        turtle.moveTo(-130/2,150/2);
        turtle.moveTo(-130/2,190/2);
        turtle.moveTo(-90/2,190/2);
        turtle.moveTo(-90/2,150/2);
        turtle.hide();
    }
}
