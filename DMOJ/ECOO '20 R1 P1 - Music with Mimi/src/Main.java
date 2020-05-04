import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        for (int g = 0; g < t; g++) {
            String a = kb.next();
            String b = kb.next();
            String c = kb.next();
            String d = kb.next();
            System.out.println(f(a, b, c, d));
        }
    }
    static String f(String a, String b, String c, String d) {
        String[] s = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
        int aIn = 0;
        int bIn = 0;
        int cIn = 0;
        for (int i = 0; i < 12; i++) {
            if (s[i].equals(a)) {
                aIn = i;
            }
            if (s[i].equals(b)) {
                bIn = i;
            }
            if (s[i].equals(c)) {
                cIn = i;
            }
        }
        if (s[aIn + 4].equals(b) && s[bIn + 3].equals(c) && s[cIn + 3].equals(d)) {
            return "root";
        } else if (s[aIn + 3].equals(b) && s[bIn + 3].equals(c) && s[cIn + 2].equals(d)) {
            return "first";
        } else if (s[aIn + 3].equals(b) && s[bIn + 2].equals(c) && s[cIn + 4].equals(d)) {
            return "second";
        } else if (s[aIn + 2].equals(b) && s[bIn + 4].equals(c) && s[cIn + 3].equals(d)) {
            return "third";
        } else {
            return "invalid";
        }
    }
}
