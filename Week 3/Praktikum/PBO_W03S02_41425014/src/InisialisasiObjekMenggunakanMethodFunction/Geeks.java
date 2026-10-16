/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InisialisasiObjekMenggunakanMethodFunction;

/**
 *
 * @author USER
 */

//NAMA: Stefanie Nurhaini Harianja
//NIM : 41425014
//Motto: Tidak harus cepat, yang penting terus melangkah dan Jangan takut gagal, 
//       takutlah jika tidak mencoba.

public class Geeks {
    
    static String name;
    static float price;
    
    static void set(String n, float p){
        name = n;
        price = p;
    }
    
    static void get()
    {
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + price);
    }
    
    public static void main(String args[])
    {
        Geeks.set("Visual studio", 0.0f);
        Geeks.get();
    } 
}
