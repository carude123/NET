/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantidadesnumericas;
import java.util.Scanner;
/**
 *
 * @author estudiante
 */
public class CANTIDADESNUMERICAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int A;
       int B;
       
       System.out.println("INGRESE EL VALOR DE A");
       Scanner D1 = new Scanner (System.in);
       A= D1.nextInt();
       
       System.out.println(" INGRESE EL VALOR DE B");
       Scanner D2 = new Scanner(System.in);
       B= D2.nextInt();
       
       if (A>B){ System.out.println( A + "  " + " ES MAYOR  QUE " +B);}
       // TODO code application logic here
       if (B>A){ System.out.println( B + "  " +" ES MENOR  QUE " + A);}
    }
    
}
