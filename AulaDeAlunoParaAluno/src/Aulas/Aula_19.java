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
public class Aula_19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = sc.nextLine();

        System.out.println("Qual sua Idade?");
        int idade = sc.nextInt();

        if (idade < 1){
            System.out.println("Idade Informada não é válida.!!");
        }else if(idade <18){
            System.out.println(nome + " è Menor de idade!!");
        }else{
            System.out.println(nome + " è Maior de idade!!");
            
        }

    }
}
