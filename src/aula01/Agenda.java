package aula01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Agenda {
    public List<Contato> listaContatos = new ArrayList<>();

    public void deletar(Contato contato) {
        listaContatos.remove(contato);
    }
    public Contato buscar(String nome) {
        // int indexContato = listaContatos.indexOf();
        // listaContatos.stream().
        /*Stream<Contato> contatoStream = listaContatos.stream().filter(contato -> contato.nome.equals(nome));
        contatoStream.findAny().get();*/
        Optional<Contato> first = listaContatos.stream().filter(contato -> contato.nome.equals(nome)).findFirst();
        if (first.isEmpty()) {
            return null;
        }

        return listaContatos.stream().filter(contato -> contato.nome.equals(nome)).findFirst().get();
    }
}
