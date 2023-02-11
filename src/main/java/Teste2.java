import java.lang.reflect.Array;
import java.util.Scanner;

public interface Teste2 {

    public static void main(String[] args) {
        System.out.println("teste");
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        String B = ("Andrei");
        while (A != B);

        if (A != B ){
            System.out.println("errado");
        } else if (A == B){
            System.out.println("certo");
        }



    }





}
