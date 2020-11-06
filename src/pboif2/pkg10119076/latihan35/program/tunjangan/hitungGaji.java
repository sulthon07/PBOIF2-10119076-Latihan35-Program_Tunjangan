/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan35.program.tunjangan;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Program Tunjangan
 */
public class hitungGaji {
    private double gaji;
    private String status;
    
    public void setGaji(double gaji){
        this.gaji = gaji;
    }
    public void setStatus(String status){
        this.status = status;
    }
    private double hitungTunjangan(){
        return status.equals("Menikah") ? gaji * 0.35 : 0;
    }
    private double hitungTotalGaji(){
        return gaji + hitungTunjangan();
    }
    public void tampilHasilPerhitungan(){
        System.out.println("\n=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok\t\t: Rp " + gaji);
        System.out.println("Tunjangan\t\t: Rp " + hitungTunjangan());
        System.out.println("Total Gaji\t\t: Rp " + hitungTotalGaji());
        System.out.println("=====================================");
        System.out.println("Developed by : Sulthon Naufal Akmal");
    }
}
