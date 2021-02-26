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
        int i, j, n = miArray1.length, aux = 0;
        for (i = 0; i < miArray1.length; i++) {
            miArray1[i] = (int) (Math.random() * 50);
        }
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (miArray1[i] > miArray1[j]) {
                    aux = miArray1[j];
                    miArray1[j] = miArray1[i];
                    miArray1[i] = aux;
                }
            }
        }
        float temp0;
        float temp1;
        int pos;
        if (miArray1.length % 2 == 0) {
            pos = (miArray1.length / 2) + 1;
            temp0 = miArray1[pos + 1];
            System.out.println("temp: " + temp0);
        }
        if (n % 2 == 1) {
            pos = miArray1.length / 2;
            temp1 = (miArray1[pos]);
            System.out.println("temp: " + temp1);
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
