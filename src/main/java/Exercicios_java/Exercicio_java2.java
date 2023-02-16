package Exercicios_java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio_java2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o Salário mensal");
        double sm = input.nextInt();

        System.out.println("Insira o percentual de reajuste");
        double pr = input.nextInt();

        double percentualreajustado = (pr/100);
        System.out.println("O novo salário com aumento é" + (sm * (1 + percentualreajustado)));

        input.close();






    }
}
