package Coding100Hari;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Hari13 {
    public static void main(String[] args) {
        
        //Tipe data
        String nama = "Atisa Wahyunianti";
        char kelas = 'A';
        int tinggi = 165;
        byte berat = 54;
        short usia = 19;
        long hobi = 5;
        float saudara = 4;
        double anakKe = 3;
        boolean perempuan = true;
        
        System.out.println("Nama = " + nama );
        System.out.println("Tinggi badan = " + tinggi +"cm" );
        System.out.println("Berat Badan = " + berat + "kg" );
        System.out.println("Usia = " + usia );
        System.out.println("Jumla Hobi = " + hobi );
        System.out.println("Jumlah Saudara = " + saudara );
        System.out.println("Anak Ke = " + anakKe );
        System.out.println("Kelas = " + kelas );
        System.out.println("Jenis Kelamin perempuan = " + perempuan);
        
        System.out.println("-----------------------------------------------");
        
        //Tipe Data Reference
        String nama1 = "Atisa Wahyunianti";
        Character kelas1 = 'A';
        Integer tinggi1 = 165;
        Byte berat1 = 54;
        Short usia1 = 19;
        Long hobi1 = 5L;
        Float saudara1 = 4F;
        Double anakKe1 = 3.0;
        Boolean perempuan1 = true;
        
        System.out.println("Nama = " + nama1 );
        System.out.println("Tinggi badan = " + tinggi1 +"cm" );
        System.out.println("Berat Badan = " + berat1 + "kg" );
        System.out.println("Usia = " + usia1 );
        System.out.println("Jumla Hobi = " + hobi1 );
        System.out.println("Jumlah Saudara = " + saudara1 );
        System.out.println("Anak Ke = " + anakKe1 );
        System.out.println("Kelas = " + kelas1 );
        System.out.println("Jenis Kelamin perempuan = " + perempuan1 );
        
        System.out.println("-------------------------------------------");
        
        //Tipe Data Reference Ke2
        BigInteger a = new BigInteger("123456789");
        BigDecimal b = new BigDecimal("987654321");
        
        System.out.println("Nilai BigInteger = " + a);
        System.out.println("Nilai Bigdecimal = " + b);
        
        
       
    }
    
}
