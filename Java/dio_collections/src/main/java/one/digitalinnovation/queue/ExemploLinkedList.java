package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args){

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");
        System.out.println(filaBanco);

        // .poll()  retorna e remove o primeiro elemento da fila e retorna null caso a fila esteja vazia
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        // .peek()  retorna e não remove o primeiro elemento da fila e retorna null caso a fila esteja vazia
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        // .element()  retorna e não remove o primeiro elemento a fila e caso a fila esteja vazia ele retorna uma exeção
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        // navegar pela lista
        for(String cliente: filaBanco){
            System.out.println(cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while(iteratorFilaBanco.hasNext()){
            System.out.println("---->" + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());

        //filaBanco.clear();
        //System.out.println(filaBanco.isEmpty());]

        filaBanco.add("Wesley");
        System.out.println(filaBanco);
    }
}
