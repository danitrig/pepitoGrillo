package Tarea3;

import java.util.Scanner;

/**
 *
 * Esta clase crea un array´de enteros, lo inicializa con números aleatorios del
 * 0 al 50 y los ordena de menor a mayor a través de diferentes métodos. Si el
 * array tiene un número par de elementos muestra la posición central + 2, y en
 * caso de ser impar mostrará la posición central.
 * EN EL PORTAL DE BELÉNfffffffffffffffffffff
 * @author Daniel
 * @version 1.0
 *
 */
public class Tarea3 {

    public static void main(String[] args) {
        /**
         * @param miArray1 Declaración de un array unidimensional de enteros.
         *
         * @param elementos Declaración de un entero para establecer los
         * elementos de miArray1.
         */
        int elementos;
        Scanner teclado = new Scanner(System.in);
        int[] miArray1;

        System.out.println("¿Cuántos elementos debe contener el array?");
        elementos = teclado.nextInt();
        miArray1 = new int[elementos];

        //Llamada al método que inicializa el array.
        rellenaArray(miArray1);
        //Llamada al método que ordena el array de menor a mayor.
        organizaraArray(miArray1);

        //Condicionales, en función si el número de elementos del array es par o impar.
        if (miArray1.length % 2 == 0) {
            System.out.println("temp: " + miArray1[miArray1.length / 2 + 2]);
        }
        if (miArray1.length % 2 == 1) {
            System.out.println("temp: " + miArray1[miArray1.length / 2]);
        }
    }

    private static void rellenaArray(int[] pArray) {
        /**
         * Este método se encarga de recorrer el array y asignarle a cada
         * posición un entero de forma aleatoria con Math.ramdom.
         */
        for (int i = 0; i < pArray.length; i++) {
            pArray[i] = (int) (Math.random() * 50);
        }
    }

    private static void organizaraArray(int[] pArray) {
        /**
         * Este método se encarga de recorrer el array y mostrar cada una de sus
         * posiciones por pantalla.
         *
         * @param int copiaTemporal Declaración de un entero donde iremos
         * copiando el contenido de una posición para que no se pierda al
         * moverla.
         */

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
