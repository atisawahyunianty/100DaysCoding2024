package Coding100Hari;

import java.util.Scanner;

public class Hari30 {

    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        System.out.println("Masukkan angka pertama :");
        int angka1 = tisa.nextInt();
        System.out.println("masukkan angka ke dua :");
        int angka2 = tisa.nextInt();
        System.out.println("Masukkan angka ke tiga :");
        int angka3 = tisa.nextInt();
        
        //Jumlah total dari ketiga angka
        int total = angka1 + angka2 + angka3;
        
        //Rata-rata ketiga angka tersebut
        int rataRata = (angka1 + angka2 + angka3) / 3;
        
        //Hasil dari (angka1 * angka2) + angka3
        int Hasil = (angka1 * angka2) + angka3;
        
        System.out.println("Jumlah angka :" + total);
        System.out.println("Rata-rata :" + rataRata);
        System.out.println("Hasil mengalikan angka1 dan angka2 dan menjumlahkan dengan angka3 :" + Hasil);
    }

}
