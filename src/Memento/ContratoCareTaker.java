package Memento;

import Model.ContratoMemento;

import java.util.ArrayList;

public class ContratoCareTaker {

    protected ArrayList<ContratoMemento> contratos;

    public ContratoCareTaker() {
        contratos = new ArrayList<>();
    }

    public void adicionarMemento(ContratoMemento memento) {
        contratos.add(memento);
    }

    public ContratoMemento getUltimoEstadoSalvo() {
        if (contratos.size() <= 0) {
            return new ContratoMemento();
        }
        ContratoMemento estadoSalvo = contratos.get(contratos.size() - 1);
        contratos.remove(contratos.size() - 1);
        return estadoSalvo;
    }
}
