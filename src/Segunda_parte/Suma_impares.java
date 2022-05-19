/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segunda_parte;
import java.io.Console;
import java.util.Scanner;
/**
 *
 * @author Manuelillo
 */
public class Suma_impares {
    public static void main(String[] args) {
       
    }
    public static void  Sparte1(){
        //se inicia la variable en 0
        int sumaImpares = 0;
        System.out.println("ingrese un numero");
        Scanner numero = new Scanner(System.in);
        int n = numero.nextInt();
        for(int i = 0 ; i<=n ; i++){
        if (i%2 == 1 && i <= n){
            sumaImpares += i;
        }
       }
        System.out.println("La suma de los impares es: "+sumaImpares);
    }
    
    public static void  Sparte2(){
        //se inicia la variable en 0
        int sumaImpares = 0;
        //aqui se le pide al usuario el ingresar dos numero como rango para el calculo de la suma de numeros impares entre ellos
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese el numero minimo: ");
        int minimo = numero.nextInt();
        System.out.println("Ingrese el numero maximo: ");
        int maximo= numero.nextInt();
        
        for(int i = minimo; i<= maximo; i++){
            if(i%2 == 1 && i <= maximo){
                sumaImpares+= i;
            }
        }
        System.out.println("La suma de los impares es: "+sumaImpares );
    }
}
