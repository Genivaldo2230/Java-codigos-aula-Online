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
public class Aula_20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o número Inteiro.");
        int numero = sc.nextInt();
        
        if((numero % 2  == 0)||(numero <20)){ // cria condição onde tem que ser PAr abaixo de 20
            
            System.out.println("OK");
        }
    }
    
}
