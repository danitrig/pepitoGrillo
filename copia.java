package Tarea3;

/**
 *
 * Esta clase crea un array´de enteros, lo inicializa con números aleatorios 
 * del 0 al 50 y los ordena de menor a mayor a través de diferentes métodos.
 * Si el array tiene un número par de elementos muestra la posición central + 2,
 * y en caso de ser impar mostrará la posición central.
 * @author Daniel
 * @version 1.0
 */
public class copia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] miArray1 = new int[10];

        rellenaArray(miArray1);
        organizarPendientes(miArray1);

        if (miArray1.length % 2 == 0) {
            System.out.println("temp: " + miArray1[miArray1.length / 2 + 2]);
        }
        if (miArray1.length % 2 == 1) {
            System.out.println("temp: " + miArray1[miArray1.length / 2]);
        }
    }

    private static void rellenaArray(int[] pArray) {
        for (int i = 0; i < pArray.length; i++) {
            pArray[i] = (int) (Math.random() * 50);
        }
    }

    private static void organizarPendientes(int[] pArray) {
        int copiaTemporal;

        for (int i = 0; i < (pArray.length - 1); i++) {
            for (int j = i + 1; j < pArray.length; j++) {
                if (pArray[i] > pArray[j]) {
                    copiaTemporal = pArray[j];
                    pArray[j] = pArray[i];
                    pArray[i] = copiaTemporal;
                }
            }
        }
    }
}
