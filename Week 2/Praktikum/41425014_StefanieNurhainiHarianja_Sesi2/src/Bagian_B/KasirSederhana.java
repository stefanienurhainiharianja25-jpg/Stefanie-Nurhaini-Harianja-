/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

/**
 *
 * @author USER
 */

//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta data barang
        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = input.nextDouble();
        System.out.print("Masukkan jumlah beli: ");
        int jumlahBeli = input.nextInt();

        // Menghitung total harga sebelum diskon
        double totalSebelumDiskon = hargaBarang * jumlahBeli;
        double diskon = 0;

        // Memberikan diskon 10% jika total belanja minimal 100.000
        if (totalSebelumDiskon >= 100000) {
            diskon = totalSebelumDiskon * 0.10;
        }

        // Menghitung total pembayaran
        double totalBayar = totalSebelumDiskon - diskon;

        // Menampilkan hasil
        System.out.println("Total sebelum diskon: " + (int) totalSebelumDiskon);
        System.out.println("Diskon: " + (int) diskon);
        System.out.println("Total bayar: " + (int) totalBayar);
    }
}
