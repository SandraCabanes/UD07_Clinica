/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud07_clinica;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author mati
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        String nombreCli, nombre, nombrePerro, raza;
        int recuerdo, id;
        double precio;
        String estado = "inactivo";
        Calendar proxVacuna = null;

        Clinica clinica = null;
        Vacuna vacuna = null;
        Perro perro = null;
        Perro perroActivo = null;

        do {
            menu();
            System.out.print("Elige una opción: ");
            op = teclado.nextInt();

            teclado.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Introduce nombre clínica: ");
                    nombreCli = teclado.nextLine();

                    clinica = new Clinica(nombreCli);
                    break;

                case 2:
                    System.out.print("ID: ");
                    id = teclado.nextInt();
                    System.out.print("Recuerdo: ");
                    recuerdo = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Nombre: ");
                    nombre = teclado.nextLine();
                    System.out.print("Precio: ");
                    precio = teclado.nextDouble();

                    vacuna = new Vacuna(id, recuerdo, nombre, precio);
                    clinica.añadirVacuna(vacuna);
                    break;

                case 3:
                    System.out.print("Nombre: ");
                    nombrePerro = teclado.nextLine();
                    perroActivo = clinica.buscarPerro(nombrePerro);
                    if (perroActivo == null) {
                        System.out.print("Raza: ");
                        raza = teclado.nextLine();
                        perro = new Perro(nombrePerro, raza, proxVacuna);
                        clinica.añadirPerro(perro);
                    } else {
                        System.out.println("El perro ya existe");
                    }
                    break;

                case 4:
                    System.out.print("Nombre: ");
                    nombrePerro = teclado.nextLine();
                    perroActivo = clinica.buscarPerro(nombrePerro);
                    if (perroActivo == null) {
                        System.out.print("Raza: ");
                        raza = teclado.nextLine();
                        perro = new Perro(nombrePerro, raza, proxVacuna);
                        clinica.añadirPerro(perro);
                    }

                    do {
                        System.out.print("ID vacuna: ");
                        id = teclado.nextInt();
                        vacuna = clinica.obtenerVacuna(id);
                    } while (vacuna != null);

                    break;

                default:
                    System.out.println("Opción inválida");
            }
        } while (op != 0);
    }

    public static void menu() {
        System.out.println("1. Alta clínica");
        System.out.println("2. Alta vacunas");
        System.out.println("3. Alta perros");
    }

}
