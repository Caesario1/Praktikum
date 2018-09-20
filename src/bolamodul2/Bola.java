/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolamodul2;

/**
 *
 * @author WINDOWS 10
 */
public class Bola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       public class Tabung {
    private int jari;
    private double phi=3.14;
    
    public Tabung(int jari)
    {
        this.jari = jari;
    }
    
    public void setJari(int jari)
    {
        this.jari = jari;
    }
    
    public int showDiameter()
    {
        return jari*2;
    }
    
    public double showLP()
    {
        return 4*jari*jari*phi;
    }
    
    public double showVolume()
    {
        return 4/3* jari*jari*jari*phi;
    }
}
}
