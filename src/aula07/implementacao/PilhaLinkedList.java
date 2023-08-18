package aula07.implementacao;

import aula07.contrato.Pilha;

import java.util.LinkedList;

public class PilhaLinkedList extends Pilha  {
    private final LinkedList<Object> lista;

    public PilhaLinkedList() {
        this.lista = new LinkedList<>();
    }

    @Override
    public void push(Object obj) {
        this.lista.addLast(obj);
    }

    @Override
    public Object pop() {
        Object first = lista.getLast();

        this.lista.removeLast();

        return first;
    }

    @Override
    public Object peek() {
        return this.lista.getLast();
    }

    @Override
    public String toString() {
        /*return "lista < LinkedList > = " +
                lista +
                ".";*/
        return lista.toString();
    }
}
