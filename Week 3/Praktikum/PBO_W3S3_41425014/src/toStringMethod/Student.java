/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toStringMethod;

/**
 *
 * @author USER
 */
public class Student {
    
    @Override
    public String toString() {
        return "Student object";
    }
    
    public static void main(String[] args) {
        Student s = new Student();  // membuat objek student
        System.out.println(s.toString());   // memanggil toString()
    }
}