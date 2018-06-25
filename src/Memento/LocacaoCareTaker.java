package Memento;


import java.util.ArrayList;
import java.util.List;

public class LocacaoCareTaker {

    private List<LocacaoMemento> estadosLocacao = new ArrayList<LocacaoMemento>();

    public void add(LocacaoMemento state){
        this.estadosLocacao.add(state);
    }

    public LocacaoMemento get(int index){
        return estadosLocacao.get(index);
    }

    public List<LocacaoMemento> todosEstados() {
        return estadosLocacao;
    }

    public void desfazerLocacao() {
        estadosLocacao.remove(estadosLocacao.size() - 1);
    }
}
