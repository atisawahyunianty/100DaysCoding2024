package Coding100Hari;
public class Hari25 {
public static void main(String[] args){
    //konversi tipe data string ke integer dan byte
    
    String a = "100";
    int b = Integer.parseInt(a);
    System.out.println("konversi String ke integer :" + b);
    
    String c  = "50";
    byte d = Byte.parseByte(c);
    System.out.println("konversi String ke Byte :" + d);
}    
}
