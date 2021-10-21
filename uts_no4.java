import java.util.Scanner;

public class LuasLingkaran {
  
  public static void main(String[] args) {
    
    double r, luas, keliling, phi = 3.14;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan panjang jari-jari lingkaran: ");
    r = scan.nextDouble();
    luas = phi * r * r;
    System.out.println("Luas Lingkaran adalah "+luas);
    
    keliling = 2 * phi * r;
    System.out.println("Keliling Lingkaran adalah "+keliling);
  }
  
}
