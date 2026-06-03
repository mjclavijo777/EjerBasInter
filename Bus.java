/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manue
 */

public class Bus extends Vehiculo {

    public Bus(double CC, int numRuedas, String Combustible, int numPasajeros, String Color, String Origen, String Destino) {
        super(CC, numRuedas, Combustible, numPasajeros, Color, Origen, Destino);
    }

    @Override
    public void Informacion() {
        super.Informacion();
        System.out.println("Bus");
    }

    @Override
    public void iniciarViaje(String Org) {
        System.out.println("Iniciando viaje en bus desde: " + Org);
    }

    @Override
    public void finalizarViaje(String Des) {
        System.out.println("Finalizando viaje en bus en: " + Des);
    }
}
