/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manue
 */
public class Bicicleta extends Vehiculo {

    public Bicicleta(double CC, int numRuedas, String Combustible, int numPasajeros, String Color, String Origen, String Destino) {
        super(CC, numRuedas, Combustible, numPasajeros, Color, Origen, Destino);
    }

    @Override
    public void Informacion() {
        super.Informacion();
        System.out.println("Bicicleta");
    }

    @Override
    public void iniciarViaje(String Origen) {
        System.out.println("Iniciando viaje de cicla en: " + Origen);
    }

    @Override
    public void finalizarViaje(String Destino) {
        System.out.println("Finalizando viaje de cicla en: " + Destino);
    }
}
