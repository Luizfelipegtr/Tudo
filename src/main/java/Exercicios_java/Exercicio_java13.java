package Exercicios_java;

import java.util.Scanner;

public class Exercicio_java13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] M = new int[12];
        for (int i = 0; i < 12; i++) {
            System.out.println("Informe o valor do número " + (i + 1) + ": ");
            M[i] = input.nextInt();
        }
        for(int i=0; i<12; i++){
            System.out.print(M[i] + ", ");
        }
        System.out.println("Drcosmic51");
    }
}
