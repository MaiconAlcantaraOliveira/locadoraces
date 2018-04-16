/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitetura_projetos_ces;

import Dto.ContratoCarroGrande;
import Dto.HistoricoDto;
import Enum.ContratoEnum;
import Factory.ContratoFactory;
import Factory.IContrato;
import Model.Contrato;
import Singleton.HistoricoSingleton;
import java.util.Date;

/**
 *
 * @author Sam
 */
public class Arquitetura_projetos_ces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            ContratoFactory contratoFactory = new ContratoFactory();
            
            // FACTORY DE CONTRATOS, NESSE CASO ABSTRAIR OS 3 TIPOS DE CONTRATOS EM UM, A MODIFICAÇÃO
            // DEVE SER FEITA EM CADA CLASSE ESPECIALIZADA E RETORNADA NO CONTRATO GLOBAL 
            
            IContrato c1 = contratoFactory.obterContrato(ContratoEnum.CONTRATO_CARRO_GRANDE);;
            Contrato c = c1.gerarContrato();
            System.out.println(c);
            
            c1 = contratoFactory.obterContrato(ContratoEnum.CONTRATO_CARRO_MEDIO);
            c = c1.gerarContrato();
            System.out.println(c);
            
            c1 = contratoFactory.obterContrato(ContratoEnum.CONTRATO_CARRO_PEQUENO);
            c = c1.gerarContrato();
            System.out.println(c);
            
            // SINGLETON
            
        HistoricoSingleton.obterInstanciaHistorio().setItemHistorico(new HistoricoDto("no main", "madeira", "vovo", new Date()));
 
        //Caso tenha dois itens no historicos, singleton esta ok 
        System.out.println("itens historico: " + HistoricoSingleton.obterInstanciaHistorio().getItensHistorico().size());
        
        HistoricoSingleton.obterInstanciaHistorio().getItensHistorico().forEach((t) -> {
            System.out.println("\n");
            System.out.println("#################");
            System.out.println("novoModelo: " + t.getModeloCarro());
             System.out.println("novoFunc: " + t.getNomeFuncionario());
              System.out.println("novCliente: " + t.getNomeCliente());
               System.out.println("novaData: " + t.getDataLocacao());
                System.out.println("#################");

            
        });
        
    }
    
}
