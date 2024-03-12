
package ejercicios;

import static ejercicios.Ordenamiento.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Ordenamiento {
    public static String evaluar(int numero1, int numero2, int numero3, int numero4) {
//usare el ordenamiento burbuja, espero este  permitido resolverlo con este metodo
        int[] numeros = {numero1, numero2, numero3, numero4};
        int nu = numeros.length;
        for (int i = 0; i < nu - 1; i++) {
            for (int j = 0; j < nu - i - 1; j++){
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+ 1];
                    numeros[j + 1] = temp;
                }
            }
        } //string builder = crear cadena sin modificar un numero
        StringBuilder sb = new StringBuilder();
        for (int num : numeros) {
            sb.append(num).append(" ");
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Número 1:");
        int numero1 = lector.nextInt();
        System.out.print("Número 2:");
        int numero2 = lector.nextInt();
        System.out.print("Número 3:");
        int numero3 = lector.nextInt();
        System.out.print("Número 4:");
        int numero4 = lector.nextInt();
        
        String respuesta = evaluar(numero1, numero2, numero3, numero4);
        System.out.println(respuesta);
    }
}
