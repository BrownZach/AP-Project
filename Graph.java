import java.util.Scanner;
import java.awt.*;
import java.applet.*;
public class Graph extends Applet{
    public void paint(Graphics g) {
//        Graph.lines;
//        Graph.input;
//        Graph.output;
//    }
//    public void lines(Graphics g){
        for(int v = 25; v < 1000; v += 25){
            g.drawLine(v, 0, v, 1000);
            g.drawLine(0, v, 1000, v);
        }
        g.drawRect();
    }
}