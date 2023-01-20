import java.util.Scanner;
import java.awt.*;
import java.applet.*;
public class Graph extends Applet{
    int numPoints;
    int list[];

    public void paint(Graphics g) {
        Graph.lines(g);
        Graph.input(g);
//        Graph.output(g);
    }
    public static void lines(Graphics g) {
        for (int v = 25; v < 1000; v += 25) {
            g.drawLine(v, 0, v, 1000);
            g.drawLine(0, v, 1000, v);
        }
        g.fillRect(498, 0, 4, 1000);
        g.fillRect(0, 498, 1000, 4);
    }
    public static void input(Graphics g){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input how many points will be graphed ===>>");
    }
}
/*Notes
add 500 to 'x's and 'y's
check if coords can be negative
 */