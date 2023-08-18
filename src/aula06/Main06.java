package aula06;

import aula06.contrato.Lista;
import aula06.implentacao.ArrayLista;
import aula06.implentacao.ListaLigada;
import aula06.implentacao.StringArrayLista;

public class Main06 {

    public static void main(String[] args) {

        Lista lista = new ArrayLista();

        lista.add("primeiro elemento");
        lista.add("segundo elemento");
        lista.add(1);
        lista.add(2);
        lista.add(3);

        imprimirLista(lista);

        System.out.println();

        lista.remove(3);

        imprimirLista(lista);

        Lista lista2 = new StringArrayLista();
        lista2.add("Teste01");
        lista2.add("Teste02");

        imprimirLista(lista2);


        Lista lista3 = new ListaLigada();
        lista3.add("primeiro elemento");
        lista3.add("segundo elemento");
        lista3.add(1);
        lista3.add(2);

        imprimirLista(lista3);

        System.out.println();

        lista3.remove(3);

        imprimirLista(lista3);
    }

    public static void imprimirLista(Lista lista) {
        for (int i = 0 ; i < lista.size() ; i++) {
            System.out.println(lista.get(i));
        }
    }

}
