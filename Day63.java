package Coding100Hari;
public class Hari63 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
        //jika angka adalah kelipatan 2
        if(i % 2 == 0){
            continue;
        }
            System.out.println("Angka : " + i);
        }
    }
    
}
