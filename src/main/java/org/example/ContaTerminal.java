package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            Double saldo = 25.0;
            System.out.println("O saldo da conta: R$"+ String.format("%.2f", saldo));

            System.out.println("Qual valor deseja sacar: R$");
            Double valorSolicitado = scanner.nextDouble();

            if (valorSolicitado <= saldo) {
                Double saldoFinal = saldo-= valorSolicitado;
                System.out.println("Saldo da conta: R$" + String.format("%.2f", saldoFinal));
                return;
            }

            System.out.println("Saldo insuficiente! \nSeu saldo: R$" + saldo);

           scanner.close();
    }
}