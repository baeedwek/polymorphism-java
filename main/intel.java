/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ACER
 */
public class intel extends hero{
     String type =  "intel";
    
    intel(String nama){
        super(nama);
       
    }
    @Override
    void display(){
        super.display();
        System.out.println("type : "+this.type);
    }
    
}
