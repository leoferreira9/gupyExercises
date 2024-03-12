package Application;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();

        String palavraInvertida = "";
        for(int i = palavra.length() - 1; i >= 0; i--){
            palavraInvertida += palavra.charAt(i);
        }

        System.out.println(palavraInvertida);
    }
}
