/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calCuadrilatero;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner entrada= new Scanner(System.in);
        Calculo figura1;
        System.out.println("Favor ingresar el valor del lado 1 ");
        float lado1=entrada.nextFloat();
        System.out.println("Favor ingresar el valor del lado 2 ");
        float lado2=entrada.nextFloat();
        
        if (lado1 == lado2) {
            figura1 =new Calculo(lado1);
            
        }else{
            figura1 = new Calculo(lado1, lado2);
        }
        System.out.println("El perimetro del cuadrilatero es :  "+figura1.getPerimetro());
         System.out.println("El area del cuadrilatero es :  "+figura1.getArea());
        
        
    }
    
}
