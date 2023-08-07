package aula02;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int itemMenu = 0;
        Integer itemMenu = 0;
        // Conta novaConta;
        Banco banco = new Banco();
        String numeroDaConta = "";
        double saldoRestante = 0.0;

        do {
            System.out.println("Digite o número da operação que deseja fazer.");
            System.out.println("1 - criar conta");
            System.out.println("2 - depositar");
            System.out.println("3 - sacar");
            System.out.println("4 - exibir dados da conta");
            System.out.println("5 - sair");

            // itemMenu = sc.nextInt();
            itemMenu = Integer.parseInt(sc.nextLine());

            /*if (itemMenu == 1) {
                System.out.println("Digite o seu nome:");

                String nome = sc.nextLine();

                System.out.println("Digite o seu cpf:");

                String cpf = sc.nextLine();

                System.out.println("Digite o seu email:");

                String email = sc.nextLine();

                // Cliente novoCliente = new Cliente(nome, cpf, email);
                // Conta novaConta = new Conta(novoCiente);
                // novaConta = new Conta(novoCliente);
                numeroDaConta = banco.criarConta(nome, cpf, email);
                // banco.criarConta(nome, cpf, email);

                System.out.println("Conta criada com sucesso! \n");
                System.out.println("Número da conta nova = " + numeroDaConta);
            } else if (itemMenu == 2) {
                System.out.println("Digite o número da conta que deseja fazer o depósito:");

                // String numeroDaConta = sc.nextLine();
                numeroDaConta = sc.nextLine();

                System.out.println("Digite o valor a ser depositado:");

                // double deposito = sc.nextDouble();
                // deposito = sc.nextDouble();
                double deposito = Double.parseDouble(sc.nextLine());

                double saldoRestante = banco.depositar(numeroDaConta, deposito);

                System.out.println("Depósito feito com sucesso! \n");
                System.out.println("Saldo restante: R$" + saldoRestante + ".");
            } else if (itemMenu == 3) {
                System.out.println("Digite o número da conta que deseja fazer o saque:");

                // String numeroDaConta = sc.nextLine();
                numeroDaConta = sc.nextLine();

                System.out.println("Digite o valor a ser depositado:");

                // double saque = sc.nextDouble();
                // saque = sc.nextDouble();
                double saque = Double.parseDouble(sc.nextLine());

                double saldoRestante = banco.sacar(numeroDaConta, saque);

                System.out.println("Saque feito com sucesso! \n");
                System.out.println("Saldo restante: R$" + saldoRestante + ".");
            } else if (itemMenu == 4) {
                System.out.println("Digite o número da conta que deseja fazer o saque:");

                // String numeroDaConta = sc.nextLine();
                numeroDaConta = sc.nextLine();

                Conta contaEncontrada = banco.buscarConta(numeroDaConta);

                System.out.println(contaEncontrada);
            }*/

            switch (itemMenu) {
                case 1:
                    System.out.println("Digite o seu nome:");

                    String nome = sc.nextLine();

                    System.out.println("Digite o seu cpf:");

                    String cpf = sc.nextLine();

                    System.out.println("Digite o seu email:");

                    String email = sc.nextLine();

                    // Cliente novoCliente = new Cliente(nome, cpf, email);
                    // Conta novaConta = new Conta(novoCiente);
                    // novaConta = new Conta(novoCliente);
                    numeroDaConta = banco.criarConta(nome, cpf, email);
                    // banco.criarConta(nome, cpf, email);

                    System.out.println("Conta criada com sucesso! \n");
                    System.out.println("Número da conta nova = " + numeroDaConta + ".\n");
                    break;
                case 2:
                    System.out.println("Digite o número da conta que deseja fazer o depósito:");

                    // String numeroDaConta = sc.nextLine();
                    numeroDaConta = sc.nextLine();

                    System.out.println("Digite o valor a ser depositado:");

                    // double deposito = sc.nextDouble();
                    // deposito = sc.nextDouble();
                    double deposito = Double.parseDouble(sc.nextLine());

                    // double saldoRestante = banco.depositar(numeroDaConta, deposito);
                    saldoRestante = banco.depositar(numeroDaConta, deposito);

                    System.out.println("Depósito feito com sucesso! \n");
                    System.out.println("Saldo restante: R$" + saldoRestante + ".\n");
                    break;
                case 3:
                    System.out.println("Digite o número da conta que deseja fazer o saque:");

                    // String numeroDaConta = sc.nextLine();
                    numeroDaConta = sc.nextLine();

                    System.out.println("Digite o valor a ser depositado:");

                    // double saque = sc.nextDouble();
                    // saque = sc.nextDouble();
                    double saque = Double.parseDouble(sc.nextLine());

                    // double saldoRestante = banco.sacar(numeroDaConta, saque);
                    saldoRestante = banco.sacar(numeroDaConta, saque);

                    System.out.println("Saque feito com sucesso! \n");
                    System.out.println("Saldo restante: R$" + saldoRestante + ".\n");
                    break;
                case 4:
                    System.out.println("Digite o número da conta que deseja obter informações sobre:");

                    // String numeroDaConta = sc.nextLine();
                    numeroDaConta = sc.nextLine();

                    Conta contaEncontrada = banco.buscarConta(numeroDaConta);

                    System.out.println(contaEncontrada);
                    break;
            }
        } while (itemMenu != 5);
    }
}
