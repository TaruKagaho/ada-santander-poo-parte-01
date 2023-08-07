package aula02;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<Conta> contas = new ArrayList<>();

    public String criarConta(String nome, String cpf, String email) {
        Cliente novoCliente = new Cliente(nome, cpf, email);
        Conta novaConta = new Conta(novoCliente);

        this.contas.add(novaConta);

        return novaConta.getNumeroDaConta();
    }
    /*public String criarConta(String nome, String cpf, String email) {
        Cliente novoCliente = new Cliente(nome, cpf, email);
        Conta novaConta = new Conta(novoCliente);

        this.contas.add(novaConta);

        return novaConta.getNumeroDaConta();
    }*/

    public Conta buscarConta(String numeroDaConta) {
        /*for (Conta conta : contas) {
            if (conta.getNumeroDaConta().equals(numeroDaConta)) {
                return conta;
            }
        }

        return null;*/

        /*return this.contas
                .stream().
                filter(conta ->
                        conta.getNumeroDaConta().equals(numeroDaConta)
                ).findFirst()
                .get();*/
        return this.contas
                .stream().
                filter(conta ->
                        conta.getNumeroDaConta().equals(numeroDaConta)
                ).findFirst()
                .orElse(null);
    }

    public double depositar(
            String numeroDaConta,
            double valorParaDepositar
    ) {
        double saldoRestante = 0.0;

        try {
            Conta contaEncontrada = this.buscarConta(numeroDaConta);

            saldoRestante = contaEncontrada.depositar(valorParaDepositar);
        } catch (Exception e) {
            // System.out.println("Conta não encontrada!");
            throw new RuntimeException("Conta não encontrada!");
        }

        return saldoRestante;
    }

    public double sacar(
            String numeroDaConta,
            double valorParaSacar
    ) {
        double saldoRestante = 0.0;

        try {
            Conta contaEncontrada = this.buscarConta(numeroDaConta);

            saldoRestante =  contaEncontrada.sacar(valorParaSacar);
        } catch (Exception e) {
            // System.out.println("Conta não encontrada!");
            throw new RuntimeException("Conta não encontrada!");
        }

        return saldoRestante;
    }

    /*public String obterNumeroDaConta() {
        return conta;
    }*/

    /*public void imprimirDadosDaConta(String numeroDaConta) {
        Conta contaMostrarDados = buscarConta(numeroDaConta);

        System.out.println(contaMostrarDados);
    }*/
}
