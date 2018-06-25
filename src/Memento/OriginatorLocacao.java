package Memento;

import Model.Locacao;

import java.util.List;

public class OriginatorLocacao {

    private Locacao estadoLocacao;

    public void setEstadoLocacao(Locacao estadoLocacao){
        this.estadoLocacao = estadoLocacao;

    }

    public Locacao getEstadoLocacao(){
        return estadoLocacao;
    }

    public LocacaoMemento salvarEstadoLocacaoMemento(){
        return new LocacaoMemento(estadoLocacao);
    }

    public void getEstadoLocacaoMemento(LocacaoMemento memento){
        estadoLocacao = memento.getEstadoLocacao();
    }
}
