package Dto;

import Memento.TextoContratoCareTaker;
import Model.TextoContratoMementoDto;

public class TextoContrato {
    protected String texto;
    TextoContratoCareTaker caretaker;

    public TextoContrato() {
        caretaker = new TextoContratoCareTaker();
        texto = new String();
    }

    public void escreverTexto(String novoTexto) {
        caretaker.adicionarMemento(new TextoContratoMementoDto(texto));
        texto += novoTexto;
    }

    public void desfazerEscrita() {
        texto = caretaker.getUltimoEstadoSalvo().getTextoSalvo();
    }

    public void mostrarTexto() {
        System.out.println(texto);
    }
}