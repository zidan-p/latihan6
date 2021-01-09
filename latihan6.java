
package latihanPBO;
import java.util.Scanner;   //mengimport Scanner

public class latihan6 {


    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);   // membuat Scanner baru
        System.out.println("masukan nilai WEB :");  // menampilkan kalimat
        int nilai = masukan.nextInt(); // mendekalrasikan varibel serta mengisinya dengan input dari keyboard
        if (nilai >= 90)    // kondisi pertama, jika bernilai bernar maka kode program di dalamnya akan di jalankan
            System.out.println("nilai A");
        else if (nilai >= 75)   // kondisi kedua, jika bernilai bernar maka kode program di dalamnya akan di jalankan
            System.out.println("nilai B");
        else if (nilai >= 50 )  // kondisi ketiga, jika bernilai bernar maka kode program di dalamnya akan di jalankan
            System.out.println("nilai C");
        else if (nilai >= 35)   // kondisi ke-empat, jika bernilai bernar maka kode program di dalamnya akan di jalankan
            System.out.println("nilai D");
        else    // jika tidak ada pernyataan yang enar makan blok di bawah akan di jalankan
            System.out.println("nilai E");
    }
    
}
