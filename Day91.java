
package Coding100Hari;

import java.util.*;
import java.util.regex.*;

public class Hari91 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // Membaca jumlah kalimat

        // Menyimpan hasil semua kalimat
        StringBuilder results = new StringBuilder();

        // Loop untuk membaca setiap kalimat
        for (int i = 0; i < n; i++) {
            String kalimat = scanner.nextLine(); // Membaca kalimat

            // Memproses kalimat untuk menghapus kata yang duplikat
            String[] words = kalimat.split("\\s+"); // Memecah kalimat menjadi array kata
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                // Mengecek apakah kata sudah muncul sebelumnya
                if (!result.toString().toLowerCase().contains(word.toLowerCase())) {
                    // Menambahkan kata ke hasil jika belum ada
                    if (result.length() > 0) {
                        result.append(" ");
                    }
                    result.append(word);
                }
            }

            // Menambahkan hasil setiap kalimat ke hasil total
            results.append(result.toString().trim()).append("\n");
        }

        // Menampilkan semua hasil setelah semua input selesai
        System.out.println(results.toString().trim());
        }
        
    }
    
