/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formenu;

import java.util.Scanner;

/**
 *
 * @author Comp6
 */
public class ForMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre = null, grado = null, estado = null, comidaf = null, colorf = null;
        String edad = null;

        for (int i = 0; i < 2; i++) {
            System.out.println("Alumno " + (i + 1) + ": Ingrese su nombre, edad, grado, estado, comida favorita y color favorito");
            for (int in = 1; in < 8; in++) {
                switch (in) {
                    case 1:
                        nombre = teclado.nextLine();
                    case 2:
                        edad = teclado.nextLine();
                    case 3:
                        grado = teclado.nextLine();
                    case 4:
                        estado = teclado.nextLine();
                    case 5:
                        comidaf = teclado.nextLine();
                    case 6:
                        colorf = teclado.nextLine();
                }

                Datos datos = new Datos(nombre, edad, grado, estado, comidaf, colorf);
                System.out.println(" Nombre: " + datos.NOMBRE + " Edad: " + datos.EDAD + " Grado: " + datos.GRADO + " Estado: " + datos.ESTADO + " Comida: " + datos.COMIDA + " Color: " + datos.COLOR);
                Cuento cuento = new Cuento();
                String cuentoF = cuento.Cuento(nombre, edad, grado, estado, comidaf, colorf);
                System.out.println(cuentoF);
            
            }

        }
    }
    
}
