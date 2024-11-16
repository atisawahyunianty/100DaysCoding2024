
package Coding100Hari;

import java.util.Scanner;

public class Hari76 {
    public static void main(String[] args) {
          
        Scanner tisa = new Scanner (System.in);
        
        System.out.print("Masukkan kalimat :");
        String kalimat = tisa.nextLine();
        
        String upperCase = kalimat.toUpperCase();
        System.out.println("setelah di UpperCase :" + upperCase);
    }
    
}
