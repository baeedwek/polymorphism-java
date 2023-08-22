/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package load;

/**
 *
 * @author ACER
 */
public class player {
   private String name;
   private static int jumlahplayer;
    
    //overloading
    //opsi 1
    player(String name){
        player.jumlahplayer++;
        this.name= name;
    }
    
    //opsi 2
    player(){
        player.jumlahplayer++;
        this.name = "player"+player.jumlahplayer;
    }      
    
    void show(){
        System.out.println("Name :  "+this.name);
    }
}
