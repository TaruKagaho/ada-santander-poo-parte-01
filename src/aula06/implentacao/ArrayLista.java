package aula06.implentacao;

import aula06.contrato.Lista;

public class ArrayLista extends Lista {

    private int size;
    private Object[] array;

    public ArrayLista() {
        this.array = new Object[10];
    }

    @Override
    public void add(Object obj) {
        if (size == this.array.length) {
            resize();
        }

        this.array[size] = obj;
        size++;
    }

    @Override
    public Object get(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("Posicao inexistente");
        }
        return this.array[idx];
    }

    @Override
    public int size() {
        return size;
    }

    private void resize() {
        Object[] novoArray = new Object[this.array.length * 2];
        for (int i = 0; i < this.array.length; i++) {
            novoArray[i] = this.array[i];
        }
        this.array = novoArray;
    }

    @Override
    public void remove(int idx) {
        if (idx < 0 || idx >= this.size) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = idx; i < this.size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }

        this.array[this.array.length - 1] = null;
        // this.array[this.size - 1] = null;

        this.size--;
    }
}
