package Singleton;

import Dto.HistoricoDto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class HistoricoSingleton {
    
    private static List<HistoricoDto> itensHistorico;
    
    protected static HistoricoSingleton instancia;

    protected HistoricoSingleton() {
        this.itensHistorico = new ArrayList<HistoricoDto>();
        //this.itensHistorico.add(new HistoricoDto("nomeCliente", "nomeFuncionario", "modeloCarro", new Date()));
    }
    
    public static synchronized HistoricoSingleton obterInstanciaHistorio(){
            if(instancia == null){
                 instancia = new HistoricoSingleton();
                return instancia;
            }
            return instancia;
    }

    public List<HistoricoDto> getItensHistorico() {
        return itensHistorico;
    }

    public void setItensHistorico(List<HistoricoDto> itensHistorico) {
        this.itensHistorico = itensHistorico;
    }
    
    public void setItemHistorico(HistoricoDto itemHistorico){
        //System.out.println(itemHistorico.getModeloCarro());
        this.itensHistorico.add(itemHistorico);
    }

    @Override
    public String toString() {
        return "HistoricoSingleton{" + '}';
    }
}
