/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B_2b;

/**
 *
 * @author USER
 */
class SmartLamp implements Switchable, Connectable {
    private int brightness;
    private boolean isOn;

    public SmartLamp(int brightness) {
        this.brightness = brightness;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("[Lampu Pintar] Dinyalakan dengan kecerahan "
                + brightness + "%");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("[Lampu Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (!isOn) {
            System.out.println("[Error] Lampu Pintar harus menyala sebelum terhubung ke WiFi.");
        } else {
            System.out.println("[WiFi Device] Terhubung ke jaringan: "
                    + ssid + " (IP: " + ipAddress + ")");
        }
    }
}
