
package ejercicios;

import static ejercicios.Edad.evaluar;

import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int año) {
        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
        LocalDate currentDate = LocalDate.now();
        Period diferencia = Period.between(fechaNacimiento, currentDate);
        int edadUsuario = diferencia.getYears();
        return "Usted tiene " + edadUsuario + " años de edad";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int año = lector.nextInt();

        String respuesta = evaluar(dia, mes, año);
        System.out.println(respuesta);
    }
}
