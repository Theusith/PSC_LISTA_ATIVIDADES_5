/*Faça um programa que receba várias idades,
calcule e mostre a média das idades digitadas.
Finalize digitando idade igual a zero.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, media;
        int  contador = 0;
        int soma= 0;

        System.out.println("Digite as idades:");
        do{
            idade = sc.nextInt();
            if(idade != 0){
                contador++;
                soma += idade;
            }
        }while(idade != 0);
        media = soma/contador;
        System.out.println("A média é: " + media);
        sc.close();;
    }
}
