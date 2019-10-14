/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularecursiva;

import java.util.Scanner;

/**
 *
 * @author ale
 */
public class FormulaRecursiva {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,res;
        //System.out.println("ingrese un numero");
        do{
        n=s.nextInt();
        }while(n<1 || n>60);
        res=fact(n);
        System.out.println(res);
    }
    static int fact(int n){
        if(n<=5){
            return 1;
        }else{
            return 5*fact((n-2));
        }
    }
}