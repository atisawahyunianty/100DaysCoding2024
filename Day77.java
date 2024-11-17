
package Coding100Hari;

import java.util.Scanner;

public class Hari77 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        System.out.print("Masukkan inputan pertaman :");
        String kalimat1 = tisa.nextLine();
        
        System.out.print("Masukkan inputan kedua :");
        String kalimat2 = tisa.nextLine();
        
        String perbandingan = kalimat1.equals(kalimat2)? "Sama" : "Tidak Sama";
        
        System.out.println("Perbandingan :" + perbandingan);
    }
    
}
