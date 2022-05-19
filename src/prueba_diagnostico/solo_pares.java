
package prueba_diagnostico;

import java.io.Console;
import java.util.Scanner;
import Segunda_parte.Suma_impares;
import secuencia_fibonacci.secuencia_fibonacci;
/**
 *
 * @author Manuelillo
 */
public class solo_pares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //lo siguiente plantea opciones al usuario para realizar diferentes metodos
        System.out.println("Ingrese numero de 1 al 5 donde:");
        System.out.println("1 es ejercicio solo pares parte 1.");
        System.out.println("2 es ejercicio solo pares parte 2.");
        System.out.println("3 es ejercicio suma impares parte 1.");
        System.out.println("4 es ejercicio suma impares parte 2.");
        System.out.println("5 es ejercicio secuencia de fibonacci.");
        //se crea una variable con el numero digitalizado por el usuario
        Scanner parte = new Scanner(System.in);
        //la variable p tendra el numero que el usuario digito, y estara parseado a interger
        int p = parte.nextInt();
        //segun el numero escogido por el usuario el programa ejecutara el metodo correspondiente
        switch(p){
            case 1: parte1();
            break;
            case 2: parte2();
            break;
            case 3: Suma_impares.Sparte1();
            break;
            case 4: Suma_impares.Sparte2();
            break;
            case 5: secuencia_fibonacci.fibonacci();
            break;
        }
    }
 
    public static void parte1(){
        System.out.println("Ingrese un numero");
        Scanner numero = new Scanner(System.in);
        
        int n = numero.nextInt();
        
        for(int i =0 ; i < n ; i++){
            System.out.println(i *2);
        }
    }
    public static void parte2(){
        System.out.println("Ingrese un numero");
        Scanner numero = new Scanner(System.in);
        
        int n = numero.nextInt();
        
        for(int i =1 ; i < n+1 ; i++){
            System.out.println(i *2);
        }
    }
}
