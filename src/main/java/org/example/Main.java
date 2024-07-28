package org.example;

import entities.Conta;
import service.ContaTerminal;

public class Main {
    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();
        Conta conta = contaTerminal.coletarInformacoes();
        contaTerminal.mostrarInformacoes(conta);
    }
}