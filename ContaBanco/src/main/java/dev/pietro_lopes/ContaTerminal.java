package dev.pietro_lopes;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numConta;
        String agencia;
        String nomeClient;
        double saldo;

        var sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta: ");
        numConta = sc.nextInt();
        sc.nextLine(); // Consome o "Enter" após o inteiro
        System.out.println("Por favor, digite o número da agência: ");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o nome do cliente: ");
        nomeClient = sc.nextLine();
        System.out.println("Por favor, digite o saldo do cliente: ");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.", nomeClient, agencia, numConta, saldo);
    }
}
