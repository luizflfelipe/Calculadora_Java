package com.github.luizflfelipe.calculadora;


import java.util.Scanner;

class Funcionalidades {

    static int lerNumero(Scanner scanner, String mensagem){
        System.out.println(mensagem);
        return scanner.nextInt();
    }

    static void somar(int numero1, int numero2) {
        double soma = numero1 + numero2;
        System.out.println(numero1 + "+" + numero2 + " = " + soma);
    }

    static void multiplicar(int numero1, int numero2) {
        double multiplicacao = numero1 * numero2;
        System.out.println(numero1 + "x" + numero2 + " = " + multiplicacao);
    }

    static void subtrair(int numero1, int numero2) {
        double subtracao = numero1 - numero2;
        System.out.println(numero1 + "-" + numero2 + " = " + subtracao);
    }

    static void dividir(int numero1, int numero2) {
        double divisao = numero1 / numero2;
        System.out.println(numero1 + "/" + numero2 + " = " + divisao);
    }

    static void mostrarMenu(){
        System.out.println(
                """
                ===Operações===
                1.Soma
                2.Multiplicação
                3.Subtração
                4.Divisão
                5.Sair""");

    }
}
