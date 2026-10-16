/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEVEL_1;

/**
 *
 * @author USER
 */

//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

class MesinTarif {
    private String kotaAsal;
    
    public MesinTarif(String kotaAsal){
        this.kotaAsal = kotaAsal;
    }
    
    public double hitungOngkir(double beratKg){
        return beratKg * 10000;
    }
    
    public double hitungOngkir(double beratKg, double nilaiBarang){
        double biayaAsuransi = nilaiBarang * 0.01;
        return (beratKg * 10000);
    }
    
    public double hitungOngkir(double beratKg, boolean isExpress){
        double total = beratKg * 10000;
        if (isExpress) {
            total += 20000;
        }
        return total;
    }
}
public class SimulasiOverloading {
    public static void main(String[] args){
        MesinTarif tarif = new MesinTarif("Medan");
        
        System.out.println("=== INI METHOD OVERLOADING ===");
        System.out.println("Ongkir Biasa (2.0 Kg) :Rp" + tarif.hitungOngkir(2.0));
        System.out.println("Ongkir + Asuransi (Barang 5Jt): RP" + tarif.hitungOngkir(2.0, 5000000.0));
        System.out.println("Ongkir Ecpress (2.0Kg) :Rp" + tarif.hitungOngkir(2.0, true));             
    }  
}

/*
  1. Compiler dapat menentukan method hitungOngkir() yang digunakan pada
     saat compile-time karena setiap method memiliki parameter yang berbeda.
     Compiler memeriksa jumlah, tipe data, dan urutan parameter pada saat
     method dipanggil. Dari parameter tersebut, compiler dapat menentukan
     method mana yang paling sesuai sebelum program dijalankan.
 
  2. Compiler menolak method tersebut karena parameter method-nya sama
     persis dengan method yang sudah ada, yaitu hitungOngkir(double).
     Dalam method overloading, perbedaan hanya pada tipe return tidak
     cukup untuk membuat method dianggap berbeda. Jadi, method
     hitungOngkir(double) dengan return type double dan method
     hitungOngkir(double) dengan return type int dianggap memiliki
     signature yang sama dan menyebabkan konflik.
*/