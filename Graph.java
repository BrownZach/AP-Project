import java.util.Scanner;
import java.awt.*;
import java.applet.*;
public class Graph extends Applet{
    static int numPoints;
    static int list[] = new int[numPoints];
    static Scanner input = new Scanner(System.in);
    public void paint(Graphics g) {
        Graph.lines(g);
        Graph.input(g);
//        Graph.output(g);
    }
    public static void lines(Graphics g) {
        for (int l = 25; l < 1000; l += 25) {
            g.drawLine(l, 0, l, 1000);
            g.drawLine(0, l, 1000, l);
        }
        g.fillRect(498, 0, 4, 1000);
        g.fillRect(0, 498, 1000, 4);
    }
    public static void input(Graphics g){
        System.out.println("Input how many points will be graphed ===>>");
        numPoints = input.nextInt();
        for (int l = 1; l < numPoints; l++) {
            System.out.println("Input x coordinate #" + l +" ===>>");
            list[(l-1)] = input.nextInt();
        }
    }
}
/*Notes
add 500 to 'x's and 'y's
check if coords can be negative
 */