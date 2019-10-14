/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximocomundivisor;

import java.util.Scanner;

/**
 *
 * @author ale
 */

public class MaximoComunDivisor {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a,b,res;
        a=s.nextInt();
        b=s.nextInt();
        res=mcd(a,b);
        System.out.println(res);
    }
    static int mcd(int a,int b){
        if(b==0){
            return a;
        }else{
            return mcd(b,a%b);
        }
    }
}