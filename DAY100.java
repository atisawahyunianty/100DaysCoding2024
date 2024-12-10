
package Coding100Hari;

import java.util.Scanner;

public class Hari100 {
    public static void main(String[] args) {
        
        Scanner tisa = new Scanner(System.in);
        
        System.out.println("=========Kalkulator========");
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan(+)");
        System.out.println("2. Pengurangan(-)");
        System.out.println("3. Perkalian(*)");
        System.out.println("4. Pembagian(/)");
        
        System.out.print("Masukkan simbol pilihan anda: :");
        String pilih = tisa.nextLine();
        
        System.out.print("Masukkan angka pertama: ");
        double angka1 = tisa.nextDouble();
        
        System.out.print("Masukkan angka kedua: ");
        double angka2 = tisa.nextDouble();
        
        switch(pilih){
            case "+":
                double jumlah = angka1 + angka2;
                System.out.println("Hasil penjumlahan " + angka1 + " dan " + angka2 + " adalah : " + jumlah);
                break;
            case "-":
                double kurang = angka1 - angka2;
                System.out.println("Hasil pengurangan " + angka1 + " dan " + angka2 + " adalah : " + kurang);
                break;
            case "*":
                double kali = angka1 * angka2;
                System.out.println("Hasil perkalian " + angka1 + " dan " + angka2 + " adalah : " + kali);
                break;
            case "/":
               double bagi = angka1 / angka2;
               System.out.println("Hasil pembagian " + angka1 + " dan " + angka2 + " adalah : " + bagi);
               break;
            default:
                System.out.println("input tidak valid");     
        }   
    }
    
}
