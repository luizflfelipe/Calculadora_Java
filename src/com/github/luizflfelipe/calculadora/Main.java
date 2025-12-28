package com.github.luizflfelipe.calculadora;

import java.util.Scanner;
import static com.github.luizflfelipe.calculadora.Funcionalidades.*;

public class Main {
    public static void main(String[] args) {
        boolean menuAtivo = true;
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;

        while (menuAtivo) {
            mostrarMenu();
            int escolhaOperacao = scanner.nextInt(); // 1 e 5

            switch (escolhaOperacao) {
                case 1:
                    System.out.println("=== SOMA ===");
                    n1 = lerNumero(scanner,"Numero 1: ");
                    n2 = lerNumero(scanner,"Numero 2: ");
                    somar(n1, n2);
                    break;
                case 2:
                    System.out.println("=== MULTIPLICAÇÃO ===");
                    n1 = lerNumero(scanner,"Numero 1: ");
                    n2 = lerNumero(scanner,"Numero 2: ");
                    multiplicar(n1, n2);
                    break;
                case 3:
                    System.out.println("=== SUBTRAÇÃO ===");
                    n1 = lerNumero(scanner,"Numero 1: ");
                    n2 = lerNumero(scanner,"Numero 2: ");
                    subtrair(n1, n2);
                    break;
                case 4:
                    System.out.println("=== DIVISÃO ===");
                    n1 = lerNumero(scanner,"Numero 1: ");
                    n2 = lerNumero(scanner,"Numero 2: ");
                    dividir(n1, n2);
                    break;
                case 5:
                    menuAtivo = false;
                    System.out.println("=== Programa Encerrado ===");
                    break;
                default:
                    System.out.println("=== Opção Inválida ===");
                    break;
            }
        }
        scanner.close();
    }
}
