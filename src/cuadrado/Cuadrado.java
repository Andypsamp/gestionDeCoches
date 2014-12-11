/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

import java.util.Scanner;

/**
 *
 * @author dreylopez
 */
public class Cuadrado {

    public static void main(String[] args) {
        // TODO code application logic here
        
        float lado;
        Scanner obj=new Scanner(System.in);
        System.out.println("introduzca un lado");
        lado=obj.nextFloat();
        System.out.println("EL area es "+(lado*lado));
        
        System.out.println("Holaaa");
    }
    
}
