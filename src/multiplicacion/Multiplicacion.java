/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicacion;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Multiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("INGRESAR NUMERO DE FILAS PARA LA MATRIZ A: ");
    int rows1 = input.nextInt();
    System.out.print("INGRESAR NUMERO DE COLUMNAS PARA LA MATRIZ A: ");
    int columns1 = input.nextInt();

    System.out.print("INGRESAR EL NUMERO DE COLUMNAS PARA LA MATRIZ B: ");
    int rows2 = input.nextInt();
    System.out.print("INGRESAR EL NUMERO DE OCLUMNAS PAR ALA MATRIZ B: ");
    int columns2 = input.nextInt();

    if (columns1 != rows2) {
      System.out.println("UUUUUU CUATEEEEEE!: el número de columnas de la matriz 1 debe ser igual al número de filas de la matriz 2\"");
      System.exit(0);
    }

    int[][] matrix1 = new int[rows1][columns1];
    int[][] matrix2 = new int[rows2][columns2];
    int[][] result = new int[rows1][columns2];

    System.out.println("INGRESA LOS ELEMENTOS PARA LA MATRIZ  A:");
    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < columns1; j++) {
        matrix1[i][j] = input.nextInt();
      }
    }

    System.out.println("INGRESA LOS ELEMENTOS PRA LA MATRIZ B:");
    for (int i = 0; i < rows2; i++) {
      for (int j = 0; j < columns2; j++) {
        matrix2[i][j] = input.nextInt();
      }
    }

    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < columns2; j++) {
        for (int k = 0; k < columns1; k++) {
          result[i][j] += matrix1[i][k] * matrix2[k][j];
        }
      }
    }

    System.out.println("RESULTADO DE LA MATRIZ"
            + ":");
    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < columns2; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }
    }
    

