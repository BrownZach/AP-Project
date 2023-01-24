import java.util.Scanner;
import java.awt.*;
import java.applet.*;
public class Graph extends Applet{
    static int numCoords;
    static int list[];
    static Scanner input = new Scanner(System.in);
    public void paint(Graphics g) {
        Graph.lines(g);
        Graph.input(g);
        Graph.output(g);
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
        numCoords = 2 * input.nextInt();
        list = new int[numCoords];
        for (int l = 0; l < numCoords;) {
            System.out.println("Input x coordinate #" + (l + 1) +" ===>>");
            list[l] = input.nextInt();
            l ++;
            System.out.println("Input y coordinate #" + (l) +" ===>>");
            list[l] = input.nextInt();
        }
    }
    public static void output(Graphics g) {
        if (numCoords / 2 > 1){
            System.out.println("Now outputting, please wait...");
            if (numCoords / 2 > 2) {
                for (int l = 0; l < numCoords; l++) {
                    g.setColor(Color.black);
                    g.drawLine(list[l] + 500, list[l + 1] + 500, list[l + 2] + 500, list[l + 3] + 500);
                }
            }
            else {
                g.setColor(Color.black);
                g.drawLine(list[0] + 500, list[1] + 500, list[2] + 500, list[3] + 500);
            }
        }
    }
}
/*Notes
add 500 to 'x's and 'y's
check if coords can be negative
 */