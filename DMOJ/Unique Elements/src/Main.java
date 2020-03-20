import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        kb.nextLine();
        List<String> B = new ArrayList<>();
        for(int i = 0; i<N; i++){
            B.add(kb.nextLine());
        }
        Set<String> A = new HashSet<String>(B);
        System.out.println(A.size());
    }
}