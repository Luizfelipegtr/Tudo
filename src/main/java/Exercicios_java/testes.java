package Exercicios_java;

import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,numero=0, maior=0, menor=0;
        // Tem que inicializar as variaveis maior e menor com zero
        // Inicializa a variavel numero com zero para entrar no loop while
        while (numero >= 0)
        {
            System.out.println("Informe um valor positivo: ");
            if (numero > 0)
                // se o numero for positivo
                if (numero > maior)
                    // se o numero informado for maior que o conteudo atual
                    // da variavel maior, esta variavel recebe o numero informado
                    maior = numero;
                else
                    // senão a variavel menor recebe o numero informado
                    menor = numero;
        }
        System.out.println("O maior eh %d e o menor eh " + maior + menor);
        Input.close
        return 0;


    }
}
