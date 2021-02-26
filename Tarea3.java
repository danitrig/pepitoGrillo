/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea3;

/**
 *
 * @author Daniel
 */
public class Tarea3 {

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
