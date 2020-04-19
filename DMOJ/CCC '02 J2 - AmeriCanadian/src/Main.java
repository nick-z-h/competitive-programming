import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
        while(!n.equals("quit!")) {
            if(n.length() > 4) {
                if (nv(n.charAt(n.length()-3)) && n.charAt(n.length()-1) == 'r' && n.charAt(n.length()-2) == 'o') {
                    System.out.println(n.substring(0, n.length()-2) + "our");
                } else {
                    System.out.println(n);
                }
            } else {
                System.out.println(n);
            }
            n = kb.next();
        }
    }
    static boolean nv(char c) {
        switch(c) {
            case 'a':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
            case 'e': {
                return false;
            }
        }
        return true;
    }
}
