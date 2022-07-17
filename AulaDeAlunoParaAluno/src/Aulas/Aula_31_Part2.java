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
public class Aula_31_Part2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numAlunos = 5;
        double[] notaAlunos = new double[numAlunos];

        for (int i = 0; i < numAlunos; ++i) {
            System.out.println("Insira a nota do " + (i + 1) + "º aluno ");
            notaAlunos[i] = sc.nextDouble();
        }
        for (int i = 0; i < numAlunos; ++i) {
            System.out.println("->" + notaAlunos[i]);
            
        }

    }
}
