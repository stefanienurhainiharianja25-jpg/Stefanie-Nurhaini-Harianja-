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

class KurirReguler {
    protected String nama;

    public KurirReguler(String nama) {
        this.nama = nama;
    }

    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}

class KurirDrone extends KurirReguler {
    private String idDrone;

    public KurirDrone(String nama, String idDrone) {
        super(nama);
        this.idDrone = idDrone;
    }

    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama +
                " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}

public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");

        KurirReguler k1 = new KurirReguler("Budi");

        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");

        k1.kirimBarang("Jl. Sudirman No. 10");
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}

/*
  Lembar Analisis Overriding:
 
  1. Setelah @Override dihapus dan nama method diubah menjadi
     kirimbarang() dengan huruf 'b' kecil, method tersebut tidak lagi
     dianggap sebagai overriding dari method kirimBarang() milik parent.
     Hal ini terjadi karena Java membedakan huruf besar dan huruf kecil
     (case-sensitive).
 
  2. Output berubah menjadi method milik class KurirReguler, yaitu:
 
     Arka mengantar paket ke Gedung Graha Lt. 5 lewat jalur darat
     menembus kemacetan.
 
     Hal ini terjadi karena method kirimbarang() yang salah ketik tidak
     menggantikan method kirimBarang() milik parent. Akibatnya, ketika
     k2.kirimBarang() dipanggil, yang digunakan adalah method milik
     KurirReguler.
 
  3. Compiler akan memberikan pesan error yang menunjukkan bahwa method
     tersebut tidak melakukan override terhadap method dari parent.
     Contoh pesan error:
 
     method does not override or implement a method from a supertype
 
     Error tersebut muncul karena kirimbarang() tidak sama dengan
     kirimBarang(). Perbedaannya hanya huruf 'b', tetapi Java
     memperlakukan keduanya sebagai nama method yang berbeda.
 
  4. @Override berfungsi untuk memberi tahu programmer dan compiler
     bahwa method pada class child dimaksudkan untuk menggantikan
     atau mengubah method yang berasal dari class parent.
     @Override juga membantu menemukan kesalahan penulisan method,
     seperti kesalahan huruf besar dan kecil pada nama method.
*/