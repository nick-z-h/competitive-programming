import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            double orange = 0;
            double blue = 0;
            double green = 0;
            double yellow = 0;
            double pink = 0;
            double violet = 0;
            double brown = 0;
            double red = 0;
            while (true) {
                String n = kb.nextLine();
                if (n.equals("end of box")) {
                    break;
                }
                if(n.equals("orange")) {
                    orange++;
                }
                if(n.equals("blue")) {
                    blue++;
                }
                if(n.equals("green")) {
                    green++;
                }
                if(n.equals("yellow")) {
                    yellow++;
                }
                if(n.equals("pink")) {
                    pink++;
                }
                if(n.equals("violet")) {
                    violet++;
                }
                if(n.equals("brown")) {
                    brown++;
                }
                if(n.equals("red")) {
                    red++;
                }
            }
            orange = 13*Math.ceil(orange/7.0);
            blue = 13*Math.ceil(blue/7.0);
            green = 13*Math.ceil(green/7.0);
            yellow = 13*Math.ceil(yellow/7.0);
            pink = 13*Math.ceil(pink/7.0);
            violet = 13*Math.ceil(violet/7.0);
            brown = 13*Math.ceil(brown/7.0);
            System.out.println((int)(orange + blue + green + yellow + pink + violet + brown + (red*16)));
        }
    }
}
