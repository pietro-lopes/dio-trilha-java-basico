package dev.pietro_lopes;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int parametroUm;
        int parametroDois;

        var sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro dever ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) throw new ParametrosInvalidosException();
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++){
            System.out.println(i);
        }
    }
}