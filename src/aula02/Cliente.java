package aula02;

public class Cliente {
    private final String nome;
    private final String cpf;
    private final String email;

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        /*if(obj instanceof Cliente outroCliente) {
            return cpf.equals(outroCliente.cpf);
        }
        return false;*/
        if(obj instanceof Cliente clienteParaComparar) {
            return clienteParaComparar.cpf.equals(this.cpf);
        }

        return false;
        /*Cliente clienteParaComparar = (Cliente) obj;

        return clienteParaComparar.cpf.equals(this.cpf);*/
        // return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Nome do cliente: " + this.nome + "." +
                "\n CPF: " + this.cpf + "." +
                "\n email: " + this.email + ".";
        // return super.toString();
    }
}
