import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String nada = sc.nextLine();
        String line = sc.nextLine();
        String[] list = line.split(" ");
        int[] list2 = new int[list.length];

        for (int i = 0; i < N; i++) {
            list2[i] = Integer.parseInt(list[i]);
        }

        int smallest = list2[0];
        int position = 0;

        for (int i = 1; i < N; i++) {
            if (list2[i] < smallest) {
                smallest = list2[i];
                position = i;
            }
        }
        System.out.println("Menor valor: "+smallest);
        System.out.println("Posicao: "+position);

    }
}