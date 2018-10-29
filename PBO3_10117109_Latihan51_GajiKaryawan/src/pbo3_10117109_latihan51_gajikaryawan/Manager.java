/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan51_gajikaryawan;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi Program : program ini berisi program untuk menampilkan gaji karyawan
* sesuai dengan jabatan, golongan, dan jumlah kehadirannya. dengan inputan dari
* user
 */
public class Manager extends Karyawan {
    
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
      
        return (hadir*1000);
    }
    
    public float tunjanganJabatan(String Jabatan){
        switch (Jabatan){
            case "Manager" : 
                tunjanganJabatan = 2000000;
                break;
            case "Kabag" :
                tunjanganJabatan = 1000000;
            default: tunjanganJabatan = 0;
            break;
        }
        
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int Golongan){
        switch (Golongan){
            case 1: 
                tunjanganGolongan = 500000;
                break;
            case 2:
                tunjanganGolongan = 1000000;
                break;
            case 3:
                tunjanganGolongan = 1500000;
            default: tunjanganGolongan = 0;
            break;
        }
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}
