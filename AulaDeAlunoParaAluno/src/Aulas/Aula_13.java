/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Aula_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       final double PI = 3.1416;
       
        System.out.println("Informa o valor do raio");
        double raio=sc.nextDouble();
        
        double area = raio *raio*PI;
        
        System.out.println("O valor da area e  = "+ area );
        
    }
    
}
