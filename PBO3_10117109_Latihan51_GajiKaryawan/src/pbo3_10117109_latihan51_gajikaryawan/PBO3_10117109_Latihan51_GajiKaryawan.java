/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan51_gajikaryawan;
 
import java.util.Scanner;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi Program : program ini berisi program untuk menampilkan gaji karyawan
* sesuai dengan jabatan, golongan, dan jumlah kehadirannya. dengan inputan dari
* user
 */
public class PBO3_10117109_Latihan51_GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====Program Perhitungan Gaji Karyawan=====");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);
        
        Manager manager = new Manager();
        System.out.println("Masukkan NIK : ");
        manager.setNIK(sc1.next());
        System.out.println("Masukkan Nama : ");
        manager.setNama(sc2.nextLine());
        System.out.println("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(sc3.nextInt());
        System.out.println("Masukkan Jabatan (Manager/Kabag): ");
        manager.setJabatan(sc4.next());
        System.out.println("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(sc5.nextInt());
        
        System.out.println("\n=====Hasil Perhitungan=====");
        System.out.println("NIK\t: " + manager.getNIK());
        System.out.println("NAMA\t: "+ manager.getNama());
        System.out.println("GOLONGAN\t: "+ manager.getGolongan());
        System.out.println("JABATAN\t: "+ manager.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN\t: "
        + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: "
        + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: "
        + manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t: " + manager.gajiTotal());
        
    }
    
}
