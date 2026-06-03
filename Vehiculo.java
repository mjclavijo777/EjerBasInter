/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manue
 */

public abstract class Vehiculo implements Transporte {

    protected double CC;
    protected int numRuedas;
    protected String Combustible;
    protected int numPasajeros;
    protected String Color;
    protected String Origen;
    protected String Destino;

    public Vehiculo(double CC, int numRuedas, String Combustible, int numPasajeros, String Color, String Origen, String Destino) {
        this.numRuedas = numRuedas;
        this.CC = CC;
        this.Color = Color;
        this.Combustible = Combustible;
        this.numPasajeros = numPasajeros;
        this.Origen = Origen;
        this.Destino = Destino;
    }

    public void Informacion() {
        System.out.println("Color: " + Color);
        System.out.println("Cilindraje: " + CC);
        System.out.println("Combustible: " + Combustible);
        System.out.println("numPasajeros: " + numPasajeros);
        System.out.println("Numero de ruedas: " + numRuedas);
        System.out.println("Origen: " + Origen);
        System.out.println("Destino: " + Destino);
    }
}
