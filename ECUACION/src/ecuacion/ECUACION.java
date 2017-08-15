/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacion;
import java.util.Scanner;
/**
 *
 * @author estudiante
 */
public class ECUACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int   R;
        int M;
      int C;
      
      System.out.println("INGRESE EL VALOR DE M");
              Scanner D1 = new Scanner ( System.in);
              M= D1.nextInt();
              
            System.out.println("INGRESE EL VALOR DE C");
              Scanner D2 = new Scanner ( System.in);
              C = D2.nextInt(); 
              
              R = M + C / 2;
              System.out.println("El radio es igual a" + "" + R);
        // TODO code application logic here
    }
    
}
