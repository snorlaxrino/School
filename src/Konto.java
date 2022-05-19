/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author richa
 */
public class Konto {
    private double kontostand;
    private double letzteBuchung;
    
    public void einzahlen(double wert){
        kontostand += wert;
        
    }
    public void abheben(double wert){
        kontostand -= wert;
    }
    public double kontoStandAbfragen(){
        double ausgabe = kontostand;
        return ausgabe;
    }
}
