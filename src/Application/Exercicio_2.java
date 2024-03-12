package Application;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n = sc.nextInt();

        int antecessor = 0, atual = 1, prox = 0;
        boolean found = false;

        for(int i =0; i<n + 10; i++){
            prox = atual + antecessor;
            antecessor = atual;
            atual = prox;

            if(n == antecessor || n == 0 ){
                found = true;
            }
        }

        System.out.println();
        if(found == true){
            System.out.println("O número " + n +" percente a sequência de Fibonacci!");
        }else{
            System.out.println("O número " + n +" NÃO percente a sequência de Fibonacci!!");
        }
    }
}
