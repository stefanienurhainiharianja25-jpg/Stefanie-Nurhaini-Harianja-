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

import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;

        // Meminta pengguna memasukkan jari-jari lingkaran
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        // Mengecek apakah jari-jari bernilai negatif
        // aku menambah kan bagian ini karena bagian yang memenuhi instruksi 
        // validasi error jika jari-jari negatif. 
        if (r < 0) {
            System.out.println("Error: jari-jari tidak boleh negatif.");
        } else {
            // Menghitung luas dan keliling lingkaran
            double luas = PI * r * r;
            double keliling = 2 * PI * r;

            // Menampilkan hasil perhitungan
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }
    }
}