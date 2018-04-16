package Factory;

import Dto.ContratoCarroGrande;
import Dto.ContratoCarroMedio;
import Dto.ContratoCarroPequeno;
import Enum.ContratoEnum;
import Model.Contrato;


public class ContratoFactory  {
    
    public IContrato obterContrato(ContratoEnum tipoContrato) {
        
        switch(tipoContrato){
            case CONTRATO_CARRO_PEQUENO:
                return new ContratoCarroPequeno();
            case CONTRATO_CARRO_MEDIO:
                return new ContratoCarroMedio();
            case CONTRATO_CARRO_GRANDE:
                return new ContratoCarroGrande();        
        }
        return null;
    }
}
