package Exercicios_java;

import java.util.Scanner;

public class Exercicio_java7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Valores ímpares");

        for (int VI = 0; VI < 20; VI++) {
            if ((VI % 2) != 0) {
                System.out.println(VI);
            }
        }
        input.close();
    }
}
