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
public class Aula_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual seu Primeiro nome ");
        String primeroNome = sc.next();
        
        System.out.println(" Qual seu ultimo Nome ");
        String ultimoNome = sc.next();
        
        System.out.println("Qual sua idade");
        int idade = sc.nextInt();
        
        
        System.out.println("Olá " + primeroNome +" "+ ultimoNome + " de "+ idade);
    }
    
}
