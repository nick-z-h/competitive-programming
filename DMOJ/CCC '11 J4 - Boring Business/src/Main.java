import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        boolean[][] wp = new boolean[401][201];
        wp[199][5] = true;
        wp[199][6] = true;
        wp[199][7] = true;
        wp[200][1] = true;
        wp[200][2] = true;
        wp[200][3] = true;
        wp[200][7] = true;
        wp[201][3] = true;
        wp[201][7] = true;
        wp[202][3] = true;
        wp[202][7] = true;
        wp[203][3] = true;
        wp[203][4] = true;
        wp[203][5] = true;
        wp[203][7] = true;
        wp[204][5] = true;
        wp[204][7] = true;
        wp[205][3] = true;
        wp[205][4] = true;
        wp[205][5] = true;
        wp[205][7] = true;
        wp[206][3] = true;
        wp[206][7] = true;
        wp[207][3] = true;
        wp[207][4] = true;
        wp[207][5] = true;
        wp[207][6] = true;
        wp[207][7] = true;
        String dir = kb.next();
        int x = 199;
        int y = 5;
        boolean danger = false;
        while(!dir.equals("q") && !danger) {
            int dx = 0;
            int dy = 0;
            switch(dir) {
                case "d" : {
                    dy = 1;
                    break;
                }
                case "u" : {
                    dy = -1;
                    break;
                }
                case "l" : {
                    dx = -1;
                    break;
                }
                case "r" : {
                    dx = 1;
                    break;
                }

            }
            int dis = kb.nextInt();
            for(int i = 0; i < dis; i++){
                x+=dx;
                y+=dy;
                if(wp[x][y]){
                    danger = true;
                } else {
                    wp[x][y] = true;
                }
            }
            if(!danger){
                System.out.println(x-200 + " " + (y*-1) + " safe");
            } else {
                System.out.println(x-200 + " " + (y*-1) + " DANGER");
            }
            dir = kb.next();
        }
    }
}