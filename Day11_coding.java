package Coding100Hari;

public class Hari11 {

    public static void main(String[] args) {

        //Deklarasi 2 Variabel
        int var1; //deklarai var1
        byte var2; //deklarasi var2

        //Inisialisasi Variabel
        short var3 = 50; //nilai paling rendah
        String var4 = "Arkhasa"; //nama siswa
        final int var5 = 80; //nilai paling tinggi
        
        //Print dengan format
        System.out.printf("Nama Siswa: %s \n" , var4); //print nilai var4
        System.out.printf("Nilai terendah: %d \n" , var3); //print nilai var3
        System.out.printf("Nilai Tertinggi: %d \n" , var5); //print nilai var5
        
        // Update Nilai dari beberapa variable
        System.out.println("--------------------------------------");
        var3 = 30; //update nilai var3
        
        System.out.println("Setelah nilai di update: "); //keterangan
        System.out.printf("Nilai terendah: %d \n" , var3); //print nilai var3 setelah di update

    }

}
