/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ride;

/**
 *
 * @author ACER
 */
public class Ride {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kendaraan plat1 = new kendaraan();
        plat1.name = "pajero";
        //plat1.nos = 100;
        plat1.display();
        
        mobil plat2 = new mobil();
        plat2.name ="alpard/t";
        plat2.nos  = 100;
        plat2.display();
    } 
    
}
