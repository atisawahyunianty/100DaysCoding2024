package Coding100Hari;
public class Hari62 {
    public static void main(String[] args) {
        int a = 1;
        
        while(a <= 10){
            System.out.println("angka : " + a);
            
            if(a == 6){
                System.out.println("Berhenti karena mencapai 6");
                break;
            }
            a++;
        }
        System.out.println("Loop selesai");
 
    }
    
}
