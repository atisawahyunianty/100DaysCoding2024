package Coding100Hari;

import java.util.Scanner;

public class Hari49 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        System.out.print("Masukkan nilai :");
        int nilai = tisa.nextInt();
        
        if(nilai > 70){
            System.out.println("LULUS");
        }else if(nilai < 70){
            System.out.println("TIDAK LULUS");
        }
    }
    
}
