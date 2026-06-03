/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manue
 */
import java.util.Scanner;

public class ServicioDeTransporte {

    static String Org, Des;
    static int OP;
    static int Distancia;
    static int Valor;

   public static void main(String[] args) {

    Scanner Op = new Scanner(System.in);

    System.out.println("Ingrese un tipo");
    System.out.println("1. Taxi");
    System.out.println("2. Bus");
    System.out.println("3. Bicicleta");
      OP = Op.nextInt();

     switch (OP) {

        case 1 -> {
           pedirInformacion(); 

          Vehiculo taxi = new Taxi(1.0, 4, "Gasolina", 4, "Amarillo", Org, Des);


             taxi.Informacion();

                taxi.iniciarViaje(Org);

            Scanner Ds = new Scanner(System.in);
           System.out.println("Precio por Kilometro: 4.000$");
            System.out.println("Ingrese la Distancia (km): ");
            Distancia = Ds.nextInt();

            Valor = Distancia * 4000;
            System.out.println("El valor del viaje sera: " + Valor + "$");

            taxi.finalizarViaje(Des);
            System.out.println("Distancia recorrida: " + Distancia + " Km");
            }

         case 2 -> {
            pedirInformacionBus();

           
            Vehiculo bus = new Bus(1.5, 4, "Gasolina", 30, "Rojo", Org, Des);


         bus.Informacion();

            bus.iniciarViaje(Org);
            bus.finalizarViaje(Des);

            }

        case 3 -> {
           pedirInformacion();

          Vehiculo bici = new Bicicleta(0.0, 2, "Ninguno", 1, "Azul", Org, Des);


             bici.Informacion();

             bici.iniciarViaje(Org);


            Scanner Ds = new Scanner(System.in);
            System.out.println("Precio por Kilometro: 1.000$");
            System.out.println("Ingrese la Distancia (km): ");
            Distancia = Ds.nextInt();

            Valor = Distancia * 1000;
           System.out.println("El valor del viaje sera: " + Valor + "$");

           bici.finalizarViaje(Des);
           System.out.println("Distancia recorrida: " + Distancia + " Km");
            }

            default -> {
                System.out.println("Dato incorrecto");
         }
      }
 }

    public static void pedirInformacion() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el Origen: ");
        Org = sc.nextLine();

        System.out.println("Introduzca el Destino: ");
        Des = sc.nextLine();
    }

    public static void pedirInformacionBus() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la estacion de Origen: ");
        Org = sc.nextLine();

        System.out.println("Introduzca la estacion de Destino: ");
        Des = sc.nextLine();
    }
}

