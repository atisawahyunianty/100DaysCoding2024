package Coding100Hari;

import java.util.Scanner;

public class Hari60 {
    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
       
        int angka;
        
        do{
            System.out.print("Masukkan angka :");
            angka = tisa.nextInt();
            
        }while (angka <= 5);
        System.out.println("berhenti");
    }
    
}
