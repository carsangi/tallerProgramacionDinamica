
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @author Carlos Andres Sanchez
 * @author Santiago Steven Parra
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño deseado")) + 1;
        int[] arreglo = new int[tamano];
        arreglo[0] = 3;
        arreglo[1] = 2;
        arreglo[2] = 1;
        puntoA(arreglo, tamano, 0, 1, 2);
        System.out.println("Arreglo [" + 2 + "] = : " + arreglo[2]);
        System.out.println("Arreglo [" + 1 + "] = : " + arreglo[1]);
        System.out.println("Arreglo [" + 0 + "] = : " + arreglo[0]);
        puntoB(arreglo);
    }

    /**
     * Metodo Recursivo
     */
    public static void puntoA(int arreglo[], int tamano, int primero, int segundo, int tercero) {
        if (arreglo.length < 3) {

        } else {
            if (tercero < tamano - 1) {
                arreglo[tercero + 1] = arreglo[primero] + arreglo[segundo] + arreglo[tercero];
                puntoA(arreglo, tamano, primero + 1, segundo + 1, tercero + 1);
                System.out.println("Arreglo [" + (tercero + 1) + "] = : " + arreglo[tercero + 1]);

            }
        }
    }

    /**
     * Metodo Iterativo
     */
    public static void puntoB(int[] arreglo) {
        for (int i = 3; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i - 1] + arreglo[i - 2] + arreglo[i - 3];

        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Arreglo [" + (i) + "] = : " + arreglo[i]);
        }

    }

    /**
     * Metodo Tabulación
     */
    public static void puntoC() {

    }

    /**
     * Metodo Memorización
     */
    public static void puntoD() {

    }
}
