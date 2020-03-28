package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");
        System.out.println(nomes);

        // ira atualizar a informação dentro da posição do array que você escolher
        // ira trocaro Juliana por Larissa
        nomes.set(2, "Larissa");
        System.out.println(nomes);

        // o metodo 'sort' da classe 'Collections' irá ordenar o arraylist e forma alfabetica
        Collections.sort(nomes);
        System.out.println(nomes);

        // ira remover o elemento dado o indice inserido
        // após a orenação o nome removido será 'Maria'
        nomes.remove(4);
        System.out.println(nomes);

        // irá remover o item inserido, nesse caso será removido o nome 'Wesley'
        nomes.remove("Larissa");

        // retorna o item selecionado atraves do indice
        String nome = nomes.get(1);
        System.out.println(nome);

        // retorna o numero de elementos dentro a lista
        int tamanho = nomes.size();
        System.out.println(tamanho);

        // retorna um booleano para se tal elemento existe ou não dentro a lista
        boolean temAndreson = nomes.contains("Anderson");
        System.out.println(temAndreson);

        // retorna um booleano para se caso a lista esta vazia ou não
        boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);

        // retorna um inteiro que será a posição de tal elemento
        int posicao = nomes.indexOf("Carlos");
        System.out.println(posicao);

        //forma de percorrer toda a lista
        for (String nomeDoItem: nomes) {
            System.out.println("-->" + nomeDoItem);
        }

        // pode ser navegado por um while
        Iterator<String> iterator = nomes.iterator();
        // .hasNext() retorna um booleano true, sempre que houver um proximo item na lista
        while(iterator.hasNext()){
            // .next() retorna o objeto que você está interando
            System.out.println("----->" + iterator.next());
        }

        // ira limpar a lista
        nomes.clear();
        System.out.println(nomes);

    }
}
