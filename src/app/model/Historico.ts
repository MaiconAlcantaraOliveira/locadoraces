export class HistoricoVO {

    private cliente: String = '';
    private funcionario: String = '';
    private dataLocacao: String = '';

    constructor(cliente: String, funcionario: String, dataLocacao: String) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.dataLocacao = dataLocacao;
    }
}
