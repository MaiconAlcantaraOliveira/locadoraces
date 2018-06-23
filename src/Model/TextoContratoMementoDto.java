package Model;

public class TextoContratoMementoDto {
    protected String estadoTextoContrato;

    public TextoContratoMementoDto(String texto) {
        estadoTextoContrato = texto;
    }

    public String getTextoSalvo() {
        return estadoTextoContrato;
    }
}
