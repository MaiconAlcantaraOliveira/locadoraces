package Memento;

import Model.TextoContratoMementoDto;

import java.util.ArrayList;

public class TextoContratoCareTaker {
    protected ArrayList<TextoContratoMementoDto> estados;

    public TextoContratoCareTaker() {
        estados = new ArrayList<>();
    }

    public void adicionarMemento(TextoContratoMementoDto memento) {
        estados.add(memento);
    }

    public TextoContratoMementoDto getUltimoEstadoSalvo() {
        if (estados.size() <= 0) {
            return new TextoContratoMementoDto("");
        }
        TextoContratoMementoDto estadoSalvo = estados.get(estados.size() - 1);
        estados.remove(estados.size() - 1);
        return estadoSalvo;
    }
}