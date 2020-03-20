import java.util.Scanner;
class DisjointUnionSets {
    int[] rank, parent;
    int N;
    public DisjointUnionSets(int N) {
        rank = new int[N];
        parent = new int[N];
        this.N = N;
        makeSet();
    }
    void makeSet() {
        for (int i = 0; i < N; i++) {
            parent[i] = i;
        }
    }
    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);
        if (xRoot == yRoot) {
            return;
        }
        if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot;
        } else {
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int Q = kb.nextInt();
        DisjointUnionSets DUS = new DisjointUnionSets(N);
        for(int i = 0; i<Q; i++){
            char O = kb.next().charAt(0);
            int A = kb.nextInt()-1;
            int B = kb.nextInt()-1;
            if(O == 'Q'){
                if(DUS.find(A)==DUS.find(B)){
                    System.out.println("Y");
                } else {
                    System.out.println("N");
                }
            }
            if(O == 'A'){
                DUS.union(A,B);
            }
        }
    }
}