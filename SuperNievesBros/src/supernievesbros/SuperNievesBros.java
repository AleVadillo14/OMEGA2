/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supernievesbros;

import java.util.Scanner;

/**
 *
 * @author ale
 */
public class SuperNievesBros {

   public static void main(String[] args) {
        int n;
        Integer[] A;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = new Integer[n];
        for (int i = 0; i < n; i++){
            
        }
        ordenar(A, 0, n-1);
        for (int i = 0; i < n; i++) {
            
        }
    }
    
    public static void mezclar(Integer[] A,Integer l, Integer m, Integer r){
        int n1 = m-l+1;
        int n2 = r-m;
        int[] L;
        L = new int[1];
        int[] R;
        R = new int[n1];
        
        for (int i = 0; i < n1; i++) {
            L[i] = A[l+i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = A[m+1+i];
        }
        int a=0;
        int b = n2-1;
        int k = l;
        
        while (a < n1 && b>=0) {            
            if (L[a] <= R[b]) {
                A[k] = L[a];
                a++;
            }else{
                A[k] = R[b];
                b--;
            }
            k++;
        }
        while (a<n1) {            
            A[k] = L[a];
            a++;
            k++;
        }
        while (b<=0) {            
            A[k] = R[b];
            b--;
            k++;
        }
    }
    
    public static void ordenar(Integer[] A, Integer lo, Integer hi){
        if (lo<hi) {
            int m = lo + (hi-lo)/2;
            ordenar(A, lo, m);
            ordenar(A, m+1, hi);
            mezclar(A, lo, m, hi);
        }
    }
    
}
