import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        String[] arr1 = new String[N];
        String[] arr2 = new String[N];
        for (int i=0; i<N; i++) {
            arr1[i] = kb.next();
        }
        for (int i=0; i<N; i++) {
            arr2[i] = kb.next();
        }
        boolean gb = true;
        for (int i=0; i<N; i++) {
            String t = arr2[i];
            for (int j=0; j<N; j++) {
                if (arr1[j].equals(t)) {
                    if (arr2[j].equals(arr1[i]) && j!=i) {
                        gb = true;
                    } else {
                        gb = false;
                    }
                }
            }
            if (!gb) {
                System.out.println("bad");
                break;
            }
        }
        if (gb) {
            System.out.println("good");
        }
    }
}
/*
ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList(kb.nextLine().split(" ")));
        ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList(kb.nextLine().split(" ")));
        for(int i = 0; i < arr1.size(); i++) {
            int p;
            for(p = 0;p<arr2.size();p++) {
                if (arr1.get(p).equals(arr2.get(i))) {
                    break;
                }
            }
            if(!arr1.get(i).equals(arr2.get(p))||p==i) {
                System.out.println("bad");
                return;
            }
        }
        System.out.println("good");
 */