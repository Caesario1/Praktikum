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
public class BolaModul2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner inputkey = new Scanner(System.in);          
        System.out.print("Jari : ");
        int j = inputkey.nextInt();
    
        Tabung tkecil = new Tabung(j);
        System.out.println("Bola Kecil ");
        System.out.println("Diameter : " + tkecil.showDiameter());
        System.out.println("LP : " + tkecil.showLP());
        System.out.println("Volume : " + tkecil.showVolume());
       
        System.out.println("Bola Besar 2x Bola Kecil : ");
        tkecil.setJari(2*j);
        System.out.println("Diameter : " + tkecil.showDiameter());
        System.out.println("LP : " + tkecil.showLP());
        System.out.println("Volume : " + tkecil.showVolume());
    }
}
