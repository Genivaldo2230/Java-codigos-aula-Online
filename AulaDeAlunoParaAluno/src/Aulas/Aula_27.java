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
public class Aula_27 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Selecione um número de 1 á 5:");
         int num = sc.nextInt();
         
         switch(num){
             
             case 1:
                 System.out.println("Você escolheu 1.");
                 break;
             case 2:
                 System.out.println("Você escolheu 2.");
                 break;
             case 3:
                 System.out.println("Você escolheu 3.");
                 break;
             case 4:
                 System.out.println("Você escolheu 4.");
                 break;
             case 5:
                 System.out.println("Você escolheu 5.");
                 break;
             default:  //se ele nao encontra nemhum dos case ele cai em Default  e executa a funçlão abaixo
                 System.out.println("Você erro!!");
                            
         }
         
    }
    
}
