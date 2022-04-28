
package absen;

import java.util.Scanner;


public class Absen {

    
    public static void main(String[] args) {
    
    String nama;
    int nim;

    int absen;
    int angka;

        System.out.println("");
        Scanner scan = new Scanner(System.in);


        System.out.print("Masukkan nama: ");    
        nama = scan.nextLine();
 
        System.out.print("Masukkan Nim: ");
        nim = scan.nextInt();
        System.out.println("Masukkan absen pilih(1/2): ");
        System.out.println("1. Masuk Ruang");
        System.out.println("2. Keluar Ruang");
        absen = scan.nextInt();

        Data siswa = new Data(nama,nim,absen);

        System.out.println("Pilihan yang ingin ditampilkan:");
        System.out.println("1. Semua");
        System.out.println("2. Apakah murid ada berada di ruang");

        angka = scan.nextInt();
    switch (angka){
    case 1 : siswa.display();break;
    case 2 : siswa.absen();break;
  
    default :break; 
}
    
        
    }
    
}
