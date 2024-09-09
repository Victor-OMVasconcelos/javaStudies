import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }

            if (even.size() == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("par[" + j + "] = " + even.get(j));
                }
                even.clear();
            }
            if (odd.size() == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("impar[" + j + "] = " + odd.get(j));
                }
                odd.clear();
            }
        }

        for (int i = 0; i < odd.size(); i++) {
            System.out.println("impar[" + i + "] = " + odd.get(i));
        }
        for (int i = 0; i < even.size(); i++) {
            System.out.println("par[" + i + "] = " + even.get(i));
        }





    }
}