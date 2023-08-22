/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ride;

/**
 *
 * @author ACER
 */
public class mobil extends kendaraan{
    double nos;
    
    //overriding
    void display(){
        System.out.println("BMW");
        System.out.println("avanza" + this.name);
        System.out.println("power : "+this.nos);
    }
}
