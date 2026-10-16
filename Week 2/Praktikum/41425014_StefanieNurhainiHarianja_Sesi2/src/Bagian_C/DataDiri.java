/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_C;

/**
 *
 * @author USER
 */

//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

import java.util.Scanner; // aku memasukkan ini agar program bisa 
                          // menggunakan scanner

public class DataDiri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   // aku memasukkan ini agar program bisa 
                                                  // menggunakan scanner

        // Meminta pengguna memasukkan data diri
        // Bagian yang di modifikasi ada lah pada bagian ini. Dimana, data 
        // tidak lagi di tulis langsung  di code tetapi pengguna yang memasukkan
        // melalui keyboard
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        System.out.print("Masukkan tinggi badan: ");
        double tinggi = input.nextDouble();
        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean isMahasiswa = input.nextBoolean();

        // Menampilkan data diri yang sudah dimasukkan
        System.out.println("\nData Diri");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);

        // Mengubah tinggi desimal menjadi bilangan bulat
        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");
    }
}
