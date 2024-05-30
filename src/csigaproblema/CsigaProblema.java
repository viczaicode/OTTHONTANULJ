/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csigaproblema;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Csigusz;

/**
 *
 * @author ViczaiPéterMilán(SZO
 */
public class CsigaProblema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //Csigusz cs0 = new Csigusz();
            //feladat(cs0);

            Csigusz cs1 = new Csigusz("cs-1");
            feladat(cs1);

            Csigusz cs2 = new Csigusz("cs-2", Csigusz.Szinek.ZOLD);
            feladat(cs2);

            //Csigusz cs3 = new Csigusz("X3", "piros");
            //feladat(cs3);
            
            Csigusz cs4 = new Csigusz("Xy-4", Csigusz.Szinek.KEK);
            feladat(cs4);
            
            Csigusz cs5 = new Csigusz("Xy-5", Csigusz.Szinek.PIROS);
            feladat(cs5);
            
            
        } catch (Exception ex) {
            //Logger.getLogger(CsigaProblema.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("--- Egy csigusz nem jött létre");
            System.err.println("A hiba oka: "+ ex.getMessage());
        }
        
    }

    private static void feladat(Csigusz cs1) {
        System.out.println(cs1.toString());
        char elso = cs1.getSzin().charAt(0);
        System.out.println("a szín 1. betűje: " + elso);
    }

}
