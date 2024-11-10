package Coding100Hari;

import java.util.Scanner;

public class Hari70 {
    
    //method untuk pola pertama
    public static void cetakPola1(int tinggi) {
        //loop untuk mencetak setiap baris
        for (int i = 0; i < tinggi; i++) {
            //loop membuat spasi
            for (int j = 0; j < tinggi - i; j++) {
                System.out.print(" ");
            }
            
            //Variabel angka diinisialisasi dengan nilai 1
            int angka = 1;
            
            //
            for (int j = 0; j <= i; j++) {
                System.out.print(angka + " ");
                angka = angka * (i - j) / (j + 1);
            }
            //mencetak baris baru 
            System.out.println(); 
        }
    }
    public static void cetakPola2(int tinggi) {
        
        // untuk mencetak setiap baris pola kedua
        for (int i = tinggi; i >= 1; i--) {
            
        //untuk mencetak spasi pada setiap baris
        for (int j = 0; j < tinggi - i; j++) {
            System.out.print(" ");
        }
        
        //untuk mencetak angka pada setiap baris
        for (int j = tinggi - 1; j >= tinggi - i; j--) {
            System.out.print(j + " ");
        }
        //mencetak baris baru
        System.out.println(); 
    }
}

    public static void main(String[] args) {
        Scanner tisa = new Scanner(System.in);
        
        //untuk mengimputkan angka
        System.out.print("Masukkan tinggi pola: ");
        int tinggi = tisa.nextInt();
        
        //memanggil method untuk pola 1
        System.out.println("\nPola 1:");
        cetakPola1(tinggi); 
        
        //memanggil method untuk pola 2
        System.out.println("\nPola 2:");
        cetakPola2(tinggi);

    
    }
}



