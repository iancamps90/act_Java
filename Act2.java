
package ActividadesOpenBoot;

import java.util.Scanner;

public class Act2 {

    
    public static void main(String[] args) {
        Scanner sn_teclado= new Scanner(System.in);
        System.out.println(" Dime el precio del producto "); // PEDIMOS EL PRECIO DEL PRODUCTO
        
        double precio =sn_teclado.nextDouble(); // GUARDAMOS VARIABLE PRECIO
        double iva = 1.21d;                        // PRECIO FIJO DEL IVA
        double resultado = resultado1(precio, iva); // PEDIMOS LA FUNCION RESULTADO1
      
                
        System.out.println("El precio con IVA del producto es : " + resultado + "€"); //IMPRIMIMOS VALOR
        
    }
    
    static double resultado1(double precio, double iva){ // CREAMOS FUNCION CON LA OPERACION QUE NOS TIENE QUE DEVOLVER
        return precio * iva;
    }
   
}
