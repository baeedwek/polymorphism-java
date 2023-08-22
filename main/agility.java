/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ACER
 */
public class agility extends hero{
     String type =  "agility";
    
    agility (String nama){
        super(nama);
        
    }
    @Override
    void display(){
        super.display();
        System.out.println("type : "+this.type);
    }
    void showoff(){
        System.out.println("Saya hero agility!!");
    }
}
