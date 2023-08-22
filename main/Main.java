/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hero hero1 =new hero("spiderman");
        stregth hero2 = new stregth("superman");
        
        hero1.display();
        hero2.display();
        
        //polymorphism
        hero hero3 =new agility("WIBU");
        hero3.display();
        
        
        agility hero4 = new agility("WIFU");
        hero4.display();
        hero4.showoff();
        
        //intel hero4 = new hero("WIFU");
        //hero4.display();
        //*gagal
        
        //array list
        hero[] kumpulanhero = new hero[4];
        kumpulanhero[0] = hero1;
        kumpulanhero[1] = hero2;
        kumpulanhero[2] = hero3;
        kumpulanhero[3] = hero4;//casting
        
        kumpulanhero[0].display();
        kumpulanhero[1].display();
        kumpulanhero[2].display();
        
        //methodcalls
        //kumpulanhero[3].showoff();//ini tidakbisa
        hero4.showoff();
        
        //aplikasi
        hero1.attack(hero2);
        hero1.attack(hero1);
        hero1.attack(hero3);
        
        //methods calls
        //kumpulanhero[2].showoff();
    }
    
}
