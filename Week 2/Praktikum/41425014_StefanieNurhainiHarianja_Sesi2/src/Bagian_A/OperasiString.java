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
//Motto: error bukan berarti gagal

import java.util.Scanner;

public class OperasiString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        System.out.println("Panjang string: " + nama.length());
        System.out.println("Huruf pertama: " + nama.charAt(0));
        System.out.println("Mengandung spasi? " + nama.contains(" "));
    }
}

//Pertanyan Pematik
// Bagaimana jika nama yang diinput dengan lebih dari satu spasi?
// Jawaban: Jika nama yang diinput memiliki lebih dari satu spasi, semua spasi tersebut tetap dihitung 
//          sebagai karakter dalam string, dan contains(" ") tetap menghasilkan true karena terdapat spasi.
