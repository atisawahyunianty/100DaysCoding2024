
package Coding100Hari;

import java.util.Scanner;

public class Hari89 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        System.out.println("Masukkan kalimat: ");
        String kalimat = tisa.nextLine();
        
        String ubah = new StringBuilder(kalimat).reverse().toString();
        
        System.out.println(kalimat.equals(ubah) ? "Yes" : "No");
    }
    
}
