package aula01;

import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {
        Contato contato01 = new Contato("Teste 01", "1298721654");
        Contato contato02 = new Contato("Teste 02", "50963258741");
        Agenda agenda = new Agenda();

        agenda.listaContatos.add(contato01);
        agenda.listaContatos.add(contato02);

        System.out.println("Lista de contatos: " + Arrays.toString(agenda.listaContatos.toArray()));
        System.out.println();

        agenda.listaContatos.forEach(contato -> {
            contato.ligar();
            contato.detalhar();
            contato.verNumero();
            System.out.println();
        });

        agenda.deletar(contato01);

        Contato contatoProcurado = agenda.buscar("Teste 01");

        if (contatoProcurado == null) {
            System.out.println("Contato não encontrado!");
        } else {
            System.out.println("Contato: " + contatoProcurado);
        }
    }
}
