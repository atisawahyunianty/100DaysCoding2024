
package Coding100Hari;

public class Hari92 {
    public static void main(String[] args) {
         int n = 5; // tinggi pola V

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                // cetak '*' pada posisi yang sesuai untuk membentuk pola V
                if (j == i || j == (2 * n - 2 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
