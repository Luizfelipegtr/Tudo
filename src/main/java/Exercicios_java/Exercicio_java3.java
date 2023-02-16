package Exercicios_java;

import java.util.Scanner;

public class Exercicio_java3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira um valor númerico");
        double nv = input.nextInt();

        double ns = (nv + 1);
        System.out.println("O número sucessor é" + ns);

        double na = (nv - 1);
        System.out.println("O número sucessor é" + na);

        input.close();
    }
}
