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
        Calendar fecha = Calendar.getInstance();
        int año, mes, dia, hora, minutos;

        Clinica clinica = null;
        Vacuna vacuna = null;
        Perro perro = null;
        Perro perroActivo = null;
        VacunaPerro vp = null;

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
                    do {
                        System.out.print("Nombre: ");
                        nombrePerro = teclado.nextLine();
                        perroActivo = clinica.buscarPerro(nombrePerro);
                    } while (perroActivo == null);
                    System.out.print("Raza: ");
                    raza = teclado.nextLine();
                    perro = new Perro(nombrePerro, raza, null);
                    clinica.añadirPerro(perro);

                    break;

                case 4:
                    do {
                        System.out.print("Nombre: ");
                        nombrePerro = teclado.nextLine();
                        perroActivo = clinica.buscarPerro(nombrePerro);
                    } while (perroActivo == null);
                    System.out.print("Raza: ");
                    raza = teclado.nextLine();
                    perroActivo = new Perro(nombrePerro, raza, null);
                    clinica.añadirPerro(perro);

                    do {
                        clinica.mostrarVacunas();
                        System.out.print("ID vacuna: ");
                        id = teclado.nextInt();
                        vacuna = clinica.obtenerVacuna(id);
                    } while (vacuna != null);

                    System.out.println("Año: ");
                    año = teclado.nextInt();
                    System.out.println("Mes: ");
                    mes = teclado.nextInt();
                    System.out.println("Día: ");
                    dia = teclado.nextInt();
                    System.out.println("Hora: ");
                    hora = teclado.nextInt();
                    System.out.println("Minutos: ");
                    minutos = teclado.nextInt();

                    fecha.set(año, mes, dia, hora, minutos, 0);

                    vp = new VacunaPerro(fecha, vacuna);

                    if (!perroActivo.buscarVacunaPerro(vp)) {
                        perroActivo.añadirVacuna(vp);
                    } else {
                        System.out.println("No se puede administrar la misma vacuna el mismo día");
                    }

                    break;

                case 5:
                    System.out.print("Nombre: ");
                    nombrePerro = teclado.nextLine();
                    perroActivo = clinica.buscarPerro(nombrePerro);
                    perroActivo.mostrarVacunasPerro();
                    break;

                case 6:
                    System.out.print("Nombre: ");
                    nombrePerro = teclado.nextLine();
                    perroActivo = clinica.buscarPerro(nombrePerro);
                    if (perroActivo != null) {
                        perroActivo.mostrarVacunasPerro();

                        perroActivo.actualizarFecha();

                        System.out.println(perroActivo.getProxVacuna());
                    } else {
                        System.out.println("El perro no existe");
                    }
                    break;

                case 7:

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
        System.out.println("4. Vacunar perro");
        System.out.println("5. Listado de vacunas");
        System.out.println("6. Cambiar fecha vacunación");
    }

}
