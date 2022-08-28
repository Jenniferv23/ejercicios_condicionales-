
package ejercicios.tema.pkg4;

import java.util.Scanner;

public class EjerciciosTema4 {

    
    public static void main(String[] args) {
            
    //Ejercicio nùmero positivo y negativo
    
    Scanner teclado = new Scanner (System.in);
    
    System.out.println("Introduce un nùmero; ");
    int numero = teclado.nextInt();
    
    if (numero<0) {
        System.out.println("El nùmero es negativo");
         } else if(numero>0){
            System.out.println("El nùmero es positivo");
            }
        }

   }