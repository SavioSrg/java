package exercicio_70.model;

import java.util.ArrayList;

public class Pilha<T> {
    public ArrayList<T> elementos;

    public Pilha() {
        elementos = new ArrayList<>();
    }

    public void empilhar(T elemento) {
        elementos.add(elemento);
    }

    public T desempilhar() {
        return elementos.remove(elementos.size() - 1);
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }
}
