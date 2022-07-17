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
public class Aula_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira um Ano.");
        int ano = sc.nextInt();
         
        boolean x =((ano % 400 == 0) ||(ano % 4 == 0 && ano % 100 != 0));
            System.out.println(x);  
        }
    }
    