/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuencia_fibonacci;

import java.util.Scanner;

/**
 *
 * @author Manuelillo
 */
public class secuencia_fibonacci {
    public static void main(String[] args) {
       
    }
    public static void fibonacci(){
    System.out.println("Ingrese un numero mayor a 1");
       Scanner numero = new Scanner(System.in);
       int n = numero.nextInt();
        int fibo1, fibo2;
        
     if(n>=1){
        System.out.println("Los " + n + " primeros términos de la serie de Fibonacci son:");
        //se inician las variables en 0 y 1 correspondientemente
        fibo1 = 0;
        fibo2 = 1;
        
            System.out.print(fibo1 + " ");
        for(int i =0 ; i < n ; i++){
            System.out.print(fibo2 + " ");
            //aqui se realiza la suma de las variables
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        } 
     }else{
            System.out.println("El numero ingresado no es mayor o igual a 1");
        }
    }
}
