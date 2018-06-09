package Model;

public class Compra {
	private static int CONTADOR_ID;
	protected int idNotaFiscal;
	protected double valorTotal;
        private Cliente cliente;

	public Compra(Cliente cliente) {
                this.cliente = cliente;
		idNotaFiscal = ++CONTADOR_ID;
	}

	public void setValor(double valor) {
		this.valorTotal = valor;
	}

	public String getInfoNota() {
		return new String("Nota fiscal nº: " + idNotaFiscal + "\nCliente: "+cliente.getNome()+" Valor: " + valorTotal);
	}
}
