/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

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

    System.out.print("Masukkan jari-jari: ");
    double r = input.nextDouble();

    if (r < 0) {
        System.out.println("Error: jari-jari tidak boleh negatif.");
    } else {
        double luas = PI * r * r;
        double keliling = 2 * PI * r;
        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);
    }
  }
}


//Pertanyaan Pematik
//Mengapa kita perlu validasi r < 0?
//Jawaban: agar perhitungan luas dan keliling hanya dilakukan ketika input jari-jari valid.
//Dalam aplikasi nyata, di mana validasi input sangat penting?
//Jawaban: Aplikasi bank, aplikasi belanja online,aplikasi pendaftaran,form pendaftaran
