package Coding100Hari;

import java.util.Scanner;

public class Hari74 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        System.out.print("masukkan kalimat :");
        String kalimat = tisa.nextLine();
        
        int panjangKalimat = kalimat.length();
        System.out.println("panjang kalimat adalah =" + panjangKalimat);
    }
    
}
