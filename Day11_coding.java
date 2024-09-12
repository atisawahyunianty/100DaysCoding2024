package Coding100Hari;

public class Hari11 {

    public static void main(String[] args) {

        //Deklarasi 2 Variabel
        int var1;
        byte var2;

        //Inisialisasi Variabel
        short var3 = 50;
        String var4 = "Arkhasa";
        final int var5 = 80;
        
        //Print dengan format
        System.out.printf("Nama Siswa: %s \n" , var4);
        System.out.printf("Nilai terendah: %d \n" , var3);
        System.out.printf("Nilai Tertinggi: %d \n" , var5);
        
        // Update Nilai dari beberapa variable
        System.out.println("--------------------------------------");
        var3 = 30;
        
        System.out.println("Setelah nilai di update: ");
        System.out.printf("Nilai terendah: %d \n" , var3);

    }

}
