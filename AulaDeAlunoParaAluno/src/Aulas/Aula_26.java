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
public class Aula_26 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um Número de 0 a 10:");
        int numero = sc.nextInt();
        
        for(int i = 0; i<=10; ++i){
            
            if(i ==numero){
                System.out.println("O seu número é " + i);
            }else{
              System.out.println("O seu número não é " + i);
              continue;  // executa o comando for mais pula pra fora e executa resto dos comando
                      
            }
            System.out.println("XXXXXXXXXXXX");
            break;
        }
    }
}
