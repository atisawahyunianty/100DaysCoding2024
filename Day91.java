
package Coding100Hari;

import java.util.*;
import java.util.regex.*;

public class Hari91 {
    public static void main(String[] args) {
         Scanner tisa = new Scanner(System.in);
        int n = Integer.parseInt(tisa.nextLine());

        // Loop untuk membaca setiap kalimat
        for (int i = 0; i < n; i++) {
            String kalimat = tisa.nextLine();

            // Regular expression untuk mencocokkan kata yang berulang
            String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";
            
            // Menggunakan Pattern dengan flag CASE_INSENSITIVE
            Pattern a = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher b = a.matcher(kalimat);

            // Mengganti setiap kata yang cocok dengan hanya kemunculan pertama
            kalimat = b.replaceAll("");

            // Menampilkan hasil akhir
            System.out.println(kalimat.trim());
            
            
        }
        
    }
    
}
