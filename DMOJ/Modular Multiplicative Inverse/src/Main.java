import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        BigInteger n = new BigInteger(kb.next());
        BigInteger m = new BigInteger(kb.next());
        System.out.println(n.modInverse(m));
    }
}
