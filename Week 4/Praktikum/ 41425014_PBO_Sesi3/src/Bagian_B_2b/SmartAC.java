/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B_2b;

/**
 *
 * @author USER
 */
class SmartAC implements Switchable, Connectable {
    private int temperature;
    private boolean isOn;

    public SmartAC(int temperature) {
        this.temperature = temperature;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("[AC Pintar] Dinyalakan pada suhu "
                + temperature + " C");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("[AC Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (!isOn) {
            System.out.println("[Error] AC Pintar harus menyala sebelum terhubung ke WiFi.");
        } else {
            System.out.println("[WiFi Device] Terhubung ke jaringan: "
                    + ssid + " (IP: " + ipAddress + ")");
        }
    }
}
