package Coding100Hari;
public class Hari15 {
    public static void main(String[] args) {
        //Rumus mencari Luas dan Keliling pada Lingkaran
        //Rumus Keliling Lingkaran = 2 x PI x Jari-Jari
        //Rumus Luas Lingkaran = PI x r2(jarijari pangkat dua)
        
        //Menentukan nilai jari-jari
        double jarijari = 4;
        
        //Nilai PI
        double PI = 3.14;
        
        //Mencari Keliling 
        double keliling = 2 * PI * jarijari;
        
        //Mencari Luas
        double luas = PI * jarijari * jarijari;
        
        System.out.println("HASIL : ");
        System.out.println("Hasil dari keliling lingkaran = " + keliling);
        System.out.println("Hasil dari luas keliling = " + luas);
        
    }
    
}
