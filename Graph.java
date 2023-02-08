import java.util.Scanner;
import java.awt.*;
import java.applet.*;
public class Graph extends Applet {
    static int numCoords;
    static int list[];
    static Scanner input = new Scanner(System.in);
    public void paint(Graphics g) {
        lines(g);
        input(g);
        output(g);
    }
    public static void lines(Graphics g) {
        for (int l = 25; l < 1000; l += 25) {
            g.drawLine(l, 0, l, 1000);
            g.drawLine(0, l, 1000, l);
        }
        g.fillRect(498, 0, 4, 1000);
        g.fillRect(0, 498, 1000, 4);
    }
    public static void input(Graphics g) {
        System.out.println("Input how many points will be graphed ===>>");
        numCoords = 2 * input.nextInt();
        list = new int[numCoords];
        int k = 0;
        for (int l = 0; k < numCoords / 2; k++, l++) {
            System.out.println("Input x coordinate #" + (k + 1) +" ===>>");
            list[l] = input.nextInt();
            l++;
            System.out.println("Input y coordinate #" + (k + 1) +" ===>>");
            list[l] = input.nextInt();
        }
    }
    public static void output(Graphics g) {
        System.out.println("Now outputting, please wait...");
        if (numCoords / 2 < 2) {
            System.out.println("Error, cannot create a graph with 1 or fewer points");
        }
        else {
            if (numCoords / 2> 2) {
                for (int l = 0; l < numCoords / 2; l++) {
                    g.setColor(Color.black);
                    g.drawLine(list[l] + 500, -list[l + 1] + 500, list[l + 2] + 500, -list[l + 3] + 500);
                }
            }
            else {
                if (numCoords / 2 == 2) {
                    g.setColor(Color.black);
                    g.drawLine(list[0] + 500, -(list[1]) + 500, list[2] + 500, -(list[3]) + 500);
                }
            }
            System.out.println("Graphing completed");
        }
    }
}
/*Notes:
fix mystery loop
    only loops after going to applet
    no visible source of loop
    when going to applet during input applet is blank
    after successful graph, minimizing and going back causes graph to clear and input to loop
    ?
 */