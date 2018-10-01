/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author lenovo
 * 
 * NAMA  : BONAVENTURA ALDINO SENDA SENI
 * KELAS : PBO-3
 * NIM   : 10117122
 * Deskripsi Program : User memasukkan kalimat, memasukkan kalimat pengganti,
 *                     menampilkan kalimat yang telah diganti.
 * 
 */
public class PBO310117122Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here'
        String Kalimat;
        String nGanti, nJadi;
        
        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        System.out.print("Ganti kata : ");
        nGanti = scanner.nextLine();
        
        System.out.print("Menjadi Kata : ");
        nJadi = scanner.nextLine();
        
        System.out.println();
        System.out.println("========Hasil Formating=====");
        System.out.println("Kalimat Awal : " + Kalimat);
        String ganti = Kalimat.replace(nGanti,nJadi);
        System.out.println("Kalimat Baru : " + ganti);
        System.out.println("(Developed by : Bonaventura Aldino Senda Seni)");
    }
    
}
