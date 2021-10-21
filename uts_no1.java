import java.util.Scanner;

public class biayaTelpon{
    public static void main(String[] args) {
        int a1 = 9 , b1 = 30 , c1 = 40;
        int a2 = 11, b2 = 35 , c2 = 30;
        int pulsa = 150;
        int jumlahdetik1, jumlahdetik2, totaldetik, sisadetik, a3,b3,c3;
        int biayatelponperdetik, pemakaianpulsa, sisadetiktelpon, biayapersisadetik;
        int biayatelponpulsa, biayatelpon;
        System.out.printIn("Menghitung biaya telpon \n");
        System.out.printIn("J = jam");
        System.out.printIn("J mulai ="+ a1+ " : "+ b1 +" : "+ c1);
        System.out.printIn("J selesai ="+ a2+ " : "+ b2 +" : "+ c2);
        
        jumlahdetik1 = ((a1*3600)+(b1*60)+c1);
        jumlahdetik1 = ((a2*3600)+(b2*60)+c2);
        totaldetik = jumlahdetik2 - jumlahdetik1;
        a3 = totaldetik/3600;
        sisadetik = totaldetik%3600;
        b3 = sisadetik/60;
        c3 = sisadetik%60;
        
        biayatelponperdetik = 150/5;
        pemakaianpulsa = totaldetik/5;
        sisadetiktelpon = totaldetik%5;
        biayapersisadetik = sisadetiktelpon*biayatelponperdetik;
        biayatelponperpulsa = pemakaianpulsa*150;
        biayatelpon = biayatelponperpulsa+biayapersisadetik;
        
        System.out.printIn("\n Lama Percakapan = "+a3+ " : "+b3+ " : "+c3);
        System.out.printIn("Pemakaian Pulsa = "+pemakaianpulsa+"\n");
        System.out.printIn("Biaya Telpon = "+biayatelpon);
    }
}
