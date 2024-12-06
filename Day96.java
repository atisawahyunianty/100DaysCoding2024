
package Coding100Hari;

import java.util.Scanner;

public class Hari96 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // meminta input jumlah baris pada setengah bagian diamond
        System.out.print("Masukkan jumlah baris: ");
        int n = scanner.nextInt();

        // bagian atas diamond
        for (int i = 1; i <= n; i++) {
            // cetak spasi
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // cetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // bagian bawah diamond
        for (int i = n - 1; i >= 1; i--) {
            // cetak spasi
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // cetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
