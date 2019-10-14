/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolessinbalancear;

import java.util.Scanner;

/**
 *
 * @author ale
 */
public class ArbolesSinBalancear {

   public static void main(String[] args) {
        Nodo nodo = new Nodo();
        int ac = 0;
        int res,n,dato;
        int[] arreglo;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            dato = sc.nextInt();
            arreglo[i] = dato;
        }
        for (int i = 0; i < n; i++) {
            res=com(nodo, arreglo[i], 0);
            System.out.println(res);
        }
        
    }
    static int com(Nodo nodo,int dato, int ac){
        if (nodo == null) {
            Nodo nuevo = creandoNodo(dato);
            nodo = nuevo;
            return ac;
        }else{
            Nodo aux = nodo;
            ac+=1;
            if (dato > aux.dato) {
                com(aux.derecho, dato, ac);
            }
            else{
                com(aux.izquierdo, dato, ac);
            }
        }
        return 0;
    }
    static void insertar(Nodo nodo, int dato){
        if (nodo == null) {
            Nodo nuevo = creandoNodo(dato);
            nodo = nuevo;
        }else{
            Nodo aux = nodo;
            if (dato>aux.dato) {
                insertar(aux.derecho, dato);
            }else{
                insertar(aux.izquierdo, dato);
            }
        }
    }
    static Nodo creandoNodo(int dato){
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        nuevo.derecho = null;
        nuevo.izquierdo = null;
        return nuevo;
    }
}


class Nodo{
    int dato;
    Nodo izquierdo;
    Nodo derecho;
}
    
}
