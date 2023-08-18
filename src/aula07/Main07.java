package aula07;

import aula07.contrato.Pilha;
import aula07.implementacao.PilhaArrayList;
import aula07.implementacao.PilhaLinkedList;

public class Main07 {
    public static void main(String[] args) {
        Pilha lista01 = new PilhaArrayList();
        Pilha lista02 = new PilhaLinkedList();

        lista01.push("Teste 01");

        lista02.push(01234);
        lista02.push("Teste 02");
        lista02.push(98765);

        lista01.push(lista02);
        lista01.push(98765);
        lista01.push("Para remover.");

        System.out.println("Lista antes de remover:");
        System.out.println(lista01);
        System.out.println();

        lista01.pop();

        System.out.println("Lista depois de remover:");
        System.out.println(lista01);
    }
}