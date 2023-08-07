package aula01;

public class Contato {
    String nome;
    String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void ligar() {
        System.out.println("Ligando para: " + nome);
    }
    public void detalhar() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }
    public String verNumero() {
        return telefone;
    }
}
