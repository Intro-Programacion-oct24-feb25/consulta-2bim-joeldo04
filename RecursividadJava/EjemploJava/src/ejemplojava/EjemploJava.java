/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplojava;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class EjemploJava {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ejemplo de Recursividad en JAVA\n");
        System.out.println("Ingrese un numero:");
        int numero = entrada.nextInt();
        int resultado = productoRecursivo(numero);
        System.out.printf("El producto de los numeros hasta %d es: %d\n",
                numero, resultado);
    }

   
    public static int productoRecursivo(int a) {
        int producto;
    
        if (a == 1) {
            return 1;
        } else {
            
            producto = a * productoRecursivo(a - 1);
        }

        return producto;
    }
}
