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

public class OperasiMatematikaLanjutan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan angka pertama
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        // Meminta pengguna memasukkan angka kedua
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        // Menghitung sisa pembagian
        int sisaBagi = angka1 % angka2;

        // Menghitung angka pertama pangkat angka kedua
        double pangkat = Math.pow(angka1, angka2);

        // Menampilkan hasil sisa bagi
        System.out.println("Sisa bagi: " + sisaBagi);

        // Menampilkan hasil pangkat
        System.out.println("Pangkat: " + (int) pangkat);
    }
}