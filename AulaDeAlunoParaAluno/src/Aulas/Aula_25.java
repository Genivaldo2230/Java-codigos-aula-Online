package Aulas;

import java.util.Random;
import java.util.Scanner;

/**
 * @author gda_a
 * GERADOR DE NUMEROS ALEATORIOS
 * PRGRAMA GERADO DO CONHECIMENTO DA AULAS 1 AO 24
 */
public class Aula_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
       
        boolean  acertou = false;
        int tentativas = 10;
        int numeroSecreto = random.nextInt();
        long chute = 0;
        
         System.out.println(numeroSecreto);
        while(tentativas> 0 && acertou == false){
            System.out.println("Qual seu Chute ?");
            chute = sc.nextLong();
            
            if(numeroSecreto == chute){
                System.out.println("Você acertou!!");
                acertou = true;
            }else if(chute< numeroSecreto){
                --tentativas;
                System.out.println("Numero muito pequeno!" +tentativas + " tentativas Restantes");
            }
        }
        
        
        
        
    }
}
