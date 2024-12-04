
package Coding100Hari;

import java.util.Scanner;

public class Hari94 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        // meminta pengguna untuk memasukkan jumlah baris
        System.out.print("Masukkan jumlah baris: ");
        int n = tisa.nextInt();

        // membuat pola segitiga sama kaki
        for (int i = 1; i <= n; i++) {
            // mencetak spasi
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // mencetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // pindah ke baris berikutnya
            System.out.println();
        }
    }
    
}
