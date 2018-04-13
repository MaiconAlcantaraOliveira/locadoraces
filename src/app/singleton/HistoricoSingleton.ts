import { HistoricoVO } from './../model/Historico';

class HistoricoClass {

    private static _instance: HistoricoClass = new HistoricoClass();

    private itemHistorico: Array<HistoricoVO>;

    constructor() {
        if (HistoricoClass._instance) {
            // nao instanciado utilizar getInstance
        }
        HistoricoClass._instance = this;
    }

    public static getInstance(): HistoricoClass {
        return HistoricoClass._instance;
    }

    setItemHistorio(cliente: String, funcionario: String, dataLocacao: String) {
        this.itemHistorico.push(new HistoricoVO(cliente, funcionario, dataLocacao));
    }

    getItemHistorico() {
        return this.itemHistorico;
    }

}
