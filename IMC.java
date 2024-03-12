
package ejercicios;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {
    public static String evaluar(double peso, double estatura, int edad) {
        String condicion = "";
        double imc = peso / (estatura * estatura);

        if (edad < 45) {
            if (edad < 22) {
                condicion = "bajo";
            } else if (imc >= 22 && imc < 27) {
                condicion = "medio";
            } else {
                condicion = "alto";
            }
        } else {
            if (edad < 22) {
                condicion = "medio";
            } else if (imc >= 22 && imc < 27) {
                condicion = "alto";
            } else {
                condicion = " muy alto";
            }
        }
        return condicion;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
            System.out.print("Ingresar Peso, sin usar decimales:");
        double peso = lector.nextInt();
        System.out.print("Ingresar estatura sin usar numeros decimales (ejemplo: 176):");
        double estatura = lector.nextDouble();
        System.out.print("Ingresar Edad:");
        int edad = lector.nextInt();
        
        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}
