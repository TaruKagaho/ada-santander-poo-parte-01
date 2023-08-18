package aula07.implementacao;

import aula07.contrato.Pilha;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PilhaArrayList extends Pilha {
    private final List<Object> lista;
    // private final ArrayList<Object> lista;
    public PilhaArrayList() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void push(Object obj) {
        this.lista.add(obj);
    }

    @Override
    public Object pop() {
        if (this.lista.isEmpty()) {
            throw new NoSuchElementException("A pilha está vazia!");
        }

        Object objToRemove = this.lista.get(lista.size() - 1);

        this.lista.remove(objToRemove);

        return objToRemove;
    }

    @Override
    public Object peek() {
        if (this.lista.isEmpty()) {
            throw new NoSuchElementException("A pilha está vazia!");
        }

        return this.lista.get(lista.size() - 1);
    }

    @Override
    public String toString() {
        /*return "lista < ArrayList > = " +
                lista +
                ".";*/
        return lista.toString();
    }
}
