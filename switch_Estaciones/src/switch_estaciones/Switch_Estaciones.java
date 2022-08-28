
package switch_estaciones;

import java.util.Scanner;

public class Switch_Estaciones {

    
    public static void main(String[] args) {
        /*
        Para el Switch, deberás crear la variable estacion, y distintos case
        para las cuatro estaciones del año. Dependiendo del valor de la variable
        estacion se deberá mandar un mensaje por consola informando de la
        estación en la que está. También habrá que poner un default para cuando 
        el valor de la variable no sea una estación.
        */
        
       // Scanner dato = new Scanner (System.in);
        
       // String dato = System.out.println("Introduce una estaciòn"); 
 
       String car;
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Introduce la estaciòn en la que estas");
       car = entrada.next();
       
       
       switch (car) {
       
           case "Primavera":
               System.out.println("Estas en la estaciòn Primavera");
               break;
           case "Verano":
               System.out.println("Estas en la estaciòn Verano");
               break;
           case "Otoño":
               System.out.println("Estas en la estaciòn Otoño");
               break;
           case "Invierno":
               System.out.println("Estas en la estaciòn Invierno");
               break;
       }
                 
    }
    
}
