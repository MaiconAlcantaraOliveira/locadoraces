package Command;

import Model.Compra;

public interface PagamentoCommand {
	void processarCompra(Compra compra);
}
