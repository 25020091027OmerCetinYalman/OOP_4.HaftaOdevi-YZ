package YapayZeka;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Exercise_11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matris boyutunu girin (n): ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];
        Random random = new Random();

        System.out.println("Oluşturulan Matris:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // En çok 1 olan satırları bulma
        ArrayList<Integer> maxRows = new ArrayList<>();
        int maxRowOnes = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) count++;
            }
            if (count > maxRowOnes) {
                maxRowOnes = count;
                maxRows.clear();
                maxRows.add(i);
            } else if (count == maxRowOnes) {
                maxRows.add(i);
            }
        }

        System.out.println("En çok 1 olan satır indisleri: " + maxRows);
    }
}
