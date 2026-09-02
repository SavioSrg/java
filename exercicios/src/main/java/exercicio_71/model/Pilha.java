package exercicio_71.model;

import java.util.ArrayList;

public class Pilha <T>{
    private ArrayList<T> elementos;

    public Pilha() {
        elementos = new ArrayList<>();
    }

    public ArrayList<T> getElementos() {
        return elementos;
    }

    public void empilhar(T elemento) {
        elementos.add(elemento);
    }

    public T desempilhar() {
        return elementos.remove(elementos.size() - 1);
    }

    public T verProximoItem() {
        return elementos.get(elementos.size() - 1);
    }

    public boolean listaVazia() {
        return elementos.isEmpty();
    }
}
