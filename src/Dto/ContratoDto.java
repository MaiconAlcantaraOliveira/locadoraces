package Dto;

import Memento.ContratoCareTaker;
import Model.Contrato;
import Model.ContratoMemento;

public class ContratoDto {

    protected ContratoMemento contrato;
    ContratoCareTaker caretaker;

    public ContratoDto() {
        caretaker = new ContratoCareTaker();
        contrato = new ContratoMemento();
    }

    public void adicionarContrato(Contrato contrato) {
        caretaker.adicionarMemento(new ContratoMemento(contrato));
        this.contrato = new ContratoMemento(contrato);
        //texto += novoTexto;
    }

    public void desfazerEscrita() {
        contrato = caretaker.getUltimoEstadoSalvo();
    }

    public void mostrarTexto() {
        System.out.println(contrato.toString());
    }
}
