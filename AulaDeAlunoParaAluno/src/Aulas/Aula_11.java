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
public class Aula_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, areaRetangulo;
        
        System.out.println("Informe o valor da base: ");
        base = sc.nextDouble();
        
        System.out.println("Informe o valor da Altura:");
        altura = sc.nextDouble();
        
        areaRetangulo = base * altura;

        System.out.println("A area de um reangulo de base = " + base);
        System.out.println("e altura " + altura + ".");
        System.out.println("é " + areaRetangulo);
    }
}
