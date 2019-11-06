/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan45.cetaknama;
import java.util.Scanner;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Cetak Nama
 */
public class IF110118038Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Printer printer = new Printer();
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        printer.setNama(sc.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJmlCetak(sc.nextInt());
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
        
        
    }
    
}
