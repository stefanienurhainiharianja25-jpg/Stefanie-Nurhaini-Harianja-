/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianC;

/**
 *
 * @author USER
 */

//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

import java.util.Scanner; // Mengimpor Scanner untuk menerima input dari pengguna

public class ValidasiKartuKredit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner

        // Memasukkan 3 nomor kartu
        for (int i = 1; i <= 3; i++) {

            System.out.print("Masukkan nomor kartu: ");
            String nomorKartu = scanner.nextLine(); // Membaca nomor kartu

            // Menghapus tanda hubung dari nomor kartu
            String nomorTanpaHubung = nomorKartu.replace("-", "");

            // Mengecek apakah jumlah digit 16
            boolean jumlahDigit = nomorTanpaHubung.length() == 16;

            // Mengecek apakah digit pertama 4, 5, atau 6
            boolean digitAwal = false;

            if (nomorTanpaHubung.length() > 0) {
                char pertama = nomorTanpaHubung.charAt(0);

                if (pertama == '4' || pertama == '5' || pertama == '6') {
                    digitAwal = true;
                }
            }

            // Mengecek apakah semua karakter berupa angka
            boolean semuaAngka = true;

            for (int j = 0; j < nomorTanpaHubung.length(); j++) {
                if (!Character.isDigit(nomorTanpaHubung.charAt(j))) {
                    semuaAngka = false;
                    break;
                }
            }

            // Mengecek format tanda hubung
            boolean formatHubung = true;

            if (nomorKartu.contains("-")) {
                formatHubung = nomorKartu.matches(
                    "\\d{4}-\\d{4}-\\d{4}-\\d{4}"
                );
            }

            // Menentukan apakah nomor kartu valid
            if (jumlahDigit && digitAwal && semuaAngka && formatHubung) {
                System.out.println("Nomor kartu valid.");
            } else {
                System.out.println("Nomor kartu tidak valid!");

                // Menampilkan alasan jika digit pertama salah
                if (!digitAwal) {
                    System.out.println("Harus dimulai dengan 4, 5, atau 6.");
                }
            }

            // Memberikan jarak sebelum input berikutnya
            System.out.println();
        }

        scanner.close(); // Menutup Scanner
    }
}