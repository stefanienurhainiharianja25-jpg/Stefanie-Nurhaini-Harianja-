/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConstructorOverloading;

/**
 *
 * @author USER
 */
class Geeks {
    // constructor with one argument
    Geeks(String name)
    {
        System.out.println("Constructor with one "
                           + "argument - String: " + name);
    }
    // constructor with two arguments
    Geeks(String name, int age)
    {
        System.out.println(
            "Constructor with two arguments: "
            + " String and Integer: " + name + " " + age);
    }
    // Constructor with one argument but with different
    Geeks(long id)
    {
        System.out.println(
            "Constructor with one argument: "
            + "Long: " + id);
    }
}

public class Main {
    public static void main(String[] args)
    {

        Geeks geek2 = new Geeks("Sweta");

        Geeks geek3 = new Geeks("Amiya", 28);

        Geeks geek4 = new Geeks(325614567);
    }
}