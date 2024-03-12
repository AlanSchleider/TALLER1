package ejercicios;
import java.util.Scanner;
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        // Verificar si el resultado es inválido
        if (numVictoriasA < 0 || numVictoriasB < 0 || Math.abs(numVictoriasA - numVictoriasB) > 2) {
            return "Resultado inválido";
        }

        // Verificar termino set
        if (numVictoriasA >= 6 && numVictoriasB >= 6) {
            if (numVictoriasA == numVictoriasB + 1) {
                return "El jugador A ganó el set";
            } else if (numVictoriasB == numVictoriasA + 1) {
                return "El jugador B ganó el set";
            } else if (numVictoriasA == numVictoriasB + 2) {
                return "El jugador A ganó el set";
            } else if (numVictoriasB == numVictoriasA + 2) {
                return "El jugador B ganó el set";
            } else {
                return "El set aún no ha terminado";
            }
        }

        // Verificar set no terminado
        if (numVictoriasA == 6 && numVictoriasB < 5) {
            return "El set aún no ha terminado";
        }
        if (numVictoriasB == 6 && numVictoriasA < 5) {
            return "El set aún no ha terminado";
        }

        // El set ha terminado y ninguno de los jugadores tiene más de 6 juegos
        if (numVictoriasA > numVictoriasB) {
            return "El jugador A ganó el set";
        } else if (numVictoriasB > numVictoriasA) {
            return "El jugador B ganó el set";
        } else {
            return "El set está empatado";
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Los juegos ganados por A: ");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganados por B: ");
        int numVictoriasB = lector.nextInt();

        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}