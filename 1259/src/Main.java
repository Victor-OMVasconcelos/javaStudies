import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> pair = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                pair.add(num);
            }
            else {
                odd.add(num);
            }
        }

        Collections.sort(pair);
        Collections.sort(odd);

        for (int i = 0; i < pair.size(); i++) {
            System.out.println(pair.get(i));
        }

        for (int i = odd.size() -1; i >= 0; i--) {
            System.out.println(odd.get(i));
        }






    }
}