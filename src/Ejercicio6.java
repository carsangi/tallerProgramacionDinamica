
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @author Carlos Andres Sanchez
 * @author Santiago Steven Parra
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño deseado")) + 1;
        int[][] matriz = new int[tamano][tamano];
        puntoB(matriz, 0, 0);
    }

    /**
     * Metodo Recurencia
     */
    public static void puntoB(int[][] matriz, int i, int j) {
        int filas = matriz.length;
        if (j <= i) {
            if (i < filas && j == 0) {
                matriz[i][j] = 1;
                System.out.format("%4d", matriz[i][j]);
            } else if (i == j) {
                matriz[i][j] = (int) Math.pow((double) j, (double) j);
                System.out.format("%4d", matriz[i][j]);
            } else {
                matriz[i][j] = matriz[i - 1][j] * 3 + matriz[i - 1][j - 1] * 2;
                System.out.format("%4d", matriz[i][j]);
            }
            puntoB(matriz, i, j + 1);
        } else {
            if (i < filas - 1) {
                System.out.println();
                puntoB(matriz, i + 1, 0);
            }
        }
    }
}
