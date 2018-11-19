import galapagos.Turtle;

import java.awt.*;

public class cap2ex31 {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.bodyColor(Color.black);
        turtle.penColor(Color.black);
        turtle.speed(100);
        turtle.move(50);
        turtle.jumpTo(25,0);
        turtle.turn(270);
        turtle.move(50);

        double k=-25;
        double i=6;
        while(i!=0){
            turtle.turn(k);
            turtle.move(6.3);
            i--;
            k--;
        }



        
    }

}
