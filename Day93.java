
package Coding100Hari;

public class Hari93 {
    public static void main(String[] args) {
        int n = 5; // tinggi pola V terbalik

        for (int i = 0; i < n; i++) {
          for (int j = 0; j < 2 * n - 1; j++) {
             // cetak '*' pada posisi yang sesuai untuk membentuk pola V terbalik
             if (j == (n - 1 - i) || j == (n - 1 + i)) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}
    }
    
}
