/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ACER
 */
public class hero {
    String nama;
    
    hero(String nama){
        this.nama = nama;
    }
    void display(){
        System.out.println("Name : " + this.nama);
    }
    void attack (hero enemy){
        System.out.println("Menyerang...");
    }
}
