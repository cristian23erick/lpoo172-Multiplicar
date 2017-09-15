/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicar;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ingresando scanner
      Scanner input = new Scanner(System.in);
        int num,num2,producto=0;
        
        System.out.println("INGRESE NUMERO A MULTIPLICAR");
        num=input.nextInt();        
        System.out.println("INGRESE NUMERO MULPLICADOR");
        num2=input.nextInt();
        for(int x=num2;num2>0;num2--)
        {
            producto=producto+num;        
        }
        System.out.println("EL PRODUCTO ES: "+producto);
    }
    
}
        
       
        
        
        
                
        
        
                
        
        
    }
    
}
