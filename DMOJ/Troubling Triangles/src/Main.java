import java.util.Scanner;
public class Main {
    static class Node{
        double x;
        double y;
        Node(double x, double y){
            this.x = x;
            this.y = y;
        }
        public double distance(Node N){
            return Math.sqrt(Math.abs((x -N.x)*(x -N.x))+Math.abs((y -N.y)*(y -N.y)));
        }
    }
    static double area(double p, double q, double r){
        double l = (p+q+r)/2;
        return Math.sqrt(l*(l-p)*(l-q)*(l-r));
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        for(int i = 0; i < N; i++){
            Node a = new Node(kb.nextInt(),kb.nextInt());
            Node b = new Node(kb.nextInt(),kb.nextInt());
            Node c = new Node(kb.nextInt(),kb.nextInt());
            double p = a.distance(b);
            double q = a.distance(c);
            double r = b.distance(c);
            System.out.format("%.2f%s%.2f",area(p,q,r), " ", p+q+r);
            System.out.println();
        }
    }
}
