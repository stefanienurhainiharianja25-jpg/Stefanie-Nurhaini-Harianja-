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

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mengubah Celsius ke Fahrenheit
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " C = " + fahrenheit + " F");

        // Mengubah Fahrenheit ke Celsius
        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        double fahrenheitInput = input.nextDouble();

        double celsiusHasil = (fahrenheitInput - 32) * 5 / 9;
        System.out.printf("%.1f F = %.2f C%n", fahrenheitInput, celsiusHasil);
    }
}
