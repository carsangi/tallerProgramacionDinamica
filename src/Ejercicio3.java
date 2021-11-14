
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @author Carlos Andres Sanchez
 * @author Santiago Steven Parra
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño deseado")) + 1;
        int[] matriz = new int[tamano];
        puntoB(matriz);
    }

    /**
     * Metodo Recursivo
     */
    public static void puntoB(int[] arreglo) {
        int columnas = arreglo.length;
        for (int n = 0; n < columnas; n++) {
            int numero = 3;
            System.out.format("%" + (columnas - n) * 2 + "s", "");//formato
            for (int k = 0; k <= n; k++) {
                System.out.format("%4d", numero);
                numero = numero * (n - k) / (k + 1);
            }
            System.out.println();
        }
    }

    /**
     * Metodo Tabulación
     */
    public static void puntoC(int[] arreglo) {
        int columnas = arreglo.length;
        for (int n = 0; n < columnas; n++) {
            int numero = 3;
            System.out.format("%" + (columnas - n) * 2 + "s", "");//formato
            for (int k = 0; k <= n; k++) {
                System.out.format("%4d", numero);
                numero = numero * (n - k) / (k + 1);
            }
            System.out.println();
        }
    }
}
