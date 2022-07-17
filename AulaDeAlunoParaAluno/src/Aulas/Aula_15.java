/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas;

/**
 * Calcular milesegundos da Era unixde 1970
 * @author gda_a
 */
public class Aula_15 {
    public static void main(String[] args) {
        
        long totalMilesegundos = System.currentTimeMillis()- 10800000; //calculao as 3 hora em milesegundo iguala Dez mil oitocento milisegundos
        
        long totalSegundos = totalMilesegundos / 1000;
        long segundosAtual = totalSegundos %60;
        
        long totalMinutos = totalSegundos / 60;
        long minutosAtual = totalMinutos % 60;
        
        long totalHora = totalMinutos / 60;
        long  horaAtual = totalHora % 24;
        
        System.out.println(horaAtual + "." + minutosAtual + "." + segundosAtual);
        
    }
    
}
