package auladealunoparaaluno;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class AulaOline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com valor da pocisao: " + i);
            vetorA[i] = sc.nextInt();

            vetorB[i] = vetorA[i];
        }
        System.out.println("vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");

        System.out.println("vetor 25B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("");
    }
    
}