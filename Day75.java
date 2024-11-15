
package Coding100Hari;

import java.util.Scanner;

public class Hari75 {
    public static void main(String[] args) {
        
        Scanner tisa = new Scanner (System.in);
        
        System.out.print("Masukkan kalimat :");
        String kalimat = tisa.nextLine();
        
        String lowerCase = kalimat.toLowerCase();
        System.out.println("setelah di LowerCase :" + lowerCase);
    }
    
}
