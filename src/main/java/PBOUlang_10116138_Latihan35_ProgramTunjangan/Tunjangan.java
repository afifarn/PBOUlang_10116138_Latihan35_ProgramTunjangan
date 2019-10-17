/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOUlang_10116138_Latihan35_ProgramTunjangan;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Tunjangan
 * NoRunning
 */
public class Tunjangan {
    double tunjangan;
    double totalGaji;

     public void hitungTunjangan(double gajiPokok, String status){
         System.out.println("===Hasil Perhitungan Gaji===");
         System.out.println("Berapa Gaji Pokok anda perbulan : " + gajiPokok);
         
         //Tunjangan
         tunjangan = (status.equalsIgnoreCase("Menikah")) ? gajiPokok * 0.35 : 0;
        
         System.out.println("Tunjangan : Rp. " + tunjangan);
         
        //Total Gaji
         totalGaji = tunjangan + gajiPokok;
         System.out.println("Total Gaji : Rp. " +totalGaji);
     }
}
