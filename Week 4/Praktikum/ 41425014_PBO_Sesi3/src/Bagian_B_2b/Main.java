/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B_2b;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {

        SmartLamp lamp = new SmartLamp(80);
        SmartAC ac = new SmartAC(22);

        lamp.turnOn();
        lamp.connectToWifi("Rumah_Indah_5G", "192.168.1.50");

        ac.turnOn();
        ac.connectToWifi("Rumah_Indah_5G", "192.168.1.51");

        ac.turnOff();

        // Mencoba terhubung WiFi saat perangkat mati
        ac.connectToWifi("Rumah_Indah_5G", "192.168.1.51");
    }
}
