/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package load;

/**
 *
 * @author ACER
 */
public class Load {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        player player1 = new player("Lional Messi");
        player player2 = new player();
        player player3 = new player();
        player player4 = new player("cristiano Ronaldo");
        
        
        player1.show();
        player2.show();
        player3.show();
        player4.show();
       
        //overrloading mehthods
        int a = matematika.tambah(1,20);
        System.out.println(a);
        
        double b = matematika.tambah(1,0.98);
        System.out.println(b);
    }
    
}
