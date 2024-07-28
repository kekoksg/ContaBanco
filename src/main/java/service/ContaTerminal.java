package service;

import entities.Conta;

import java.util.Scanner;

public class ContaTerminal {

    public Conta coletarInformacoes() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, digite o seu Nome !");
        String nome = scan.nextLine();

        System.out.print("Por favor, digite o número da Agência !");
        String agencia = scan.nextLine();

        System.out.print("Por favor, digite o Número da conta !");
        int numero = Integer.parseInt(scan.nextLine());

        System.out.print("Por favor, digite o Saldo !");
        double saldo = Double.parseDouble(scan.nextLine());

        scan.close();

        return new Conta(nome, agencia, numero, saldo);
    }

    public void mostrarInformacoes(Conta conta) {
        System.out.println("Olá " + conta.getNome() +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() +
                ", conta " + conta.getNumero() +
                " e seu saldo " + conta.getSaldo() +
                " já está disponível para saque");
    }


}
