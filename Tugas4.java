/*
   Siska Hutami Pratiwi
   3411191055
   DSE B
*/

import java.util.*;
public class Tugas4 {
  public static void main(String args[]) {
    String huruf, hasil = "";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan sebuah string: ");
    huruf = scanner.nextLine();
    int jumlah = huruf.length();
    int jumlahHuruf = jumlah - 1;
    for (int i = 0; i < jumlah; i++) {
      hasil = hasil + huruf.charAt(jumlahHuruf);
      jumlahHuruf--;
    }
    System.out.println("Hasil reverse string: " + hasil);
  }
}