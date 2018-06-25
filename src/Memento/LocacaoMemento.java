package Memento;

import Model.Contrato;
import Model.Locacao;

public class LocacaoMemento {


    protected Locacao estadoLocacao;

    public LocacaoMemento() { }

    public LocacaoMemento(Locacao locacao) {
        estadoLocacao = locacao;
    }

    public Locacao getEstadoLocacao() {
        return estadoLocacao;
    }

}
