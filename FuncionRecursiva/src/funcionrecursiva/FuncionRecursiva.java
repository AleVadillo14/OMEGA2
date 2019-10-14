/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionrecursiva;

import java.util.Scanner;

/**
 *
 * @author ale
 */
public class FuncionRecursiva {

    public static void main(String[] args) {
        int n,i;
        double dato;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        double[][] matriz;
        matriz = new double[n][2];
        for (int j = 0; j < n; j++) {
            dato = sc.nextDouble();
            matriz[j][1] = dato;
            matriz[j][2] = (dato*2)+1;
        }
        for (int j = 0; j <= n; j++) {
            if (matriz[j][1] == 0) {
                System.out.println(matriz[j][1]);
            }else{
                System.out.println(matriz[j][1]+matriz[j][2]);
            }
        }
    }
    
}
