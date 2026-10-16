/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author USER
 */

//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

import java.util.Scanner; // Mengimpor Scanner untuk menerima input dari pengguna

public class KonverterWaktu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner

        System.out.println("=== Konverter Waktu ===");
        System.out.println("1. Detik ke HH:MM:SS");
        System.out.println("2. HH:MM:SS ke detik");

        // Pilihan pertama
        System.out.print("Pilihan: ");
        int pilihan1 = scanner.nextInt(); // Membaca pilihan pertama

        if (pilihan1 == 1) {

            // Meminta jumlah detik
            System.out.print("Masukkan jumlah detik: ");
            int totalDetik = scanner.nextInt(); // Membaca jumlah detik

            // Mengubah detik menjadi jam, menit, dan detik
            int jam = totalDetik / 3600; // Menghitung jam
            int menit = (totalDetik % 3600) / 60; // Menghitung menit
            int detik = totalDetik % 60; // Menghitung sisa detik

            // Membuat hasil dalam format HH:MM:SS
            String waktu = String.format("%02d:%02d:%02d", jam, menit, detik);

            // Menampilkan hasil konversi pertama
            System.out.println("Hasil: " + waktu);

            // Memberikan jarak
            System.out.println();

            // Langsung masuk ke pilihan kedua
            System.out.print("Pilihan: ");
            int pilihan2 = scanner.nextInt(); // Membaca pilihan kedua

            if (pilihan2 == 2) {

                // Menampilkan waktu dari hasil pilihan pertama
                System.out.println("Masukkan waktu (HH:MM:SS): " + waktu);

                // Memisahkan jam, menit, dan detik
                String[] bagian = waktu.split(":");

                int jam2 = Integer.parseInt(bagian[0]); // Mengambil jam
                int menit2 = Integer.parseInt(bagian[1]); // Mengambil menit
                int detik2 = Integer.parseInt(bagian[2]); // Mengambil detik

                // Mengubah HH:MM:SS kembali menjadi total detik
                int hasilDetik = (jam2 * 3600) + (menit2 * 60) + detik2;

                // Menampilkan hasil konversi kedua
                System.out.println("Hasil: " + hasilDetik + " detik");
            }
        }

        scanner.close(); // Menutup Scanner
    }
}