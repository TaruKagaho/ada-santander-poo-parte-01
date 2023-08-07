package aula02;

public class Conta {
    private static int id = 1;
    private final Cliente cliente;
    private final String numeroDaConta;
    double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.numeroDaConta = String.valueOf(id++);
        this.saldo = 0.0;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double depositar(double valor) {
    // public void depositar(double valor) {
        // this.saldo += valor;
        return this.saldo += valor;
    }

    public double sacar(double valor) {
    // public void sacar(double valor) {
        /*if (valor <= this.saldo) {
            // this.saldo -= valor;
            return this.saldo -= valor;
        }*/
        if (valor > this.saldo) {
            // this.saldo -= valor;
            return 0;
        }

        return this.saldo -= valor;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Conta contaParaComparar) {
            return contaParaComparar.numeroDaConta.equals(this.numeroDaConta);
        }

        return false;
        /*Conta contaParaComparar = (Conta) obj;

        return contaParaComparar.numeroDaConta.equals(this.numeroDaConta);*/
        // return super.equals(obj);
    }

    @Override
    public String toString() {
        /*return "Cliente: " + this.cliente.toString() +
                "\n Número da conta: " + this.numeroDaConta +
                "\n Saldo: " + this.saldo + ".\n";*/
        return this.cliente.toString() +
                "\n Número da conta: " + this.numeroDaConta + "." +
                "\n Saldo: " + this.saldo + ".\n";
        // return super.toString();
    }
}
