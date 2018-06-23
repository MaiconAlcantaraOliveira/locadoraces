package Model;

public class ContratoMemento {

    protected Contrato estadoContrato;

    public ContratoMemento(Contrato contrato) {
        estadoContrato = contrato;
    }

    public ContratoMemento() {

    }

    public Contrato getTextoSalvo() {
        return estadoContrato;
    }

    @Override
    public String toString() {
        return "ContratoMemento{" +
                "estadoContrato =  " + estadoContrato +
                '}';
    }
}
