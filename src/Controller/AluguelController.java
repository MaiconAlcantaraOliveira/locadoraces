/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dto.AluguelDTO;
import Dto.HistoricoDto;
import Enum.ContratoEnum;
import Factory.ContratoFactory;
import Factory.IContrato;
import Model.Carro;
import Model.Cliente;
import Model.Contrato;
import Model.Funcionario;
import Singleton.HistoricoSingleton;
import java.lang.reflect.Constructor;
import java.util.Date;

/**
 *
 * @author vinic
 */
public class AluguelController {
    
    private ContratoFactory contratoFactory;
    private IContrato iContrato;
 

    public AluguelController() {
        this.contratoFactory = new ContratoFactory();
    }

    public String alugarVeiculo(Cliente cliente, ContratoEnum tipoContrato){
         if(cliente.hasClienteIdadeMinima() && cliente.hasPermissaoParaDirigir()) {
             iContrato = contratoFactory.obterContrato(tipoContrato);
             Contrato contr = iContrato.gerarContrato();
             HistoricoSingleton.obterInstanciaHistorio()
                               .setItemHistorico(new HistoricoDto(cliente.getNome(),  
                                                                  contr.getNomeFuncionario(),
                                                                  "modelo_carro",
                                                                   new Date()));
             return "ALUGAR CARRO";
         }     
         return "CARRO NÃO PODE SER ALUGADO";
    }
    
    public void alugarVeiculo(AluguelDTO aluguelDto) {
        
    
    }
    
}
