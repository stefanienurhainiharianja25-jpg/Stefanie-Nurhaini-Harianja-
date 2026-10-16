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

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai pertama
        System.out.print("Masukkan nilai 1: ");
        double nilai1 = input.nextDouble();

        // Meminta pengguna memasukkan nilai kedua
        System.out.print("Masukkan nilai 2: ");
        double nilai2 = input.nextDouble();

        // Meminta pengguna memasukkan nilai ketiga
        System.out.print("Masukkan nilai 3: ");
        double nilai3 = input.nextDouble();

        // Menghitung rata-rata dari ketiga nilai
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        // Menampilkan hasil rata-rata dengan 2 angka di belakang koma
        System.out.printf("Rata-rata: %.2f%n", rataRata);
    }
}