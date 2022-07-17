/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas;

/**
 *
 * @author gda_a
 */
public class Aula_32_vetor {
    public static void main(String[] args) {
        
        int i;
        int[] x = new int[10];
       
        //esse comando serve preencher ou enceher especifica o valor em um arrays nas () inserir vetor e o conteudo assim pecorrendo o vetor pelos menbros
        java.util.Arrays.fill(x, 2, 5, 3);
        
         for(i= 0; i<x.length; ++i){
            System.out.println(x[i]);
        }
    }
    
}
