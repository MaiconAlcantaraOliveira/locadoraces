/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitetura_projetos_ces;

import Controller.AluguelController;
import Dto.HistoricoDto;
import Enum.ContratoEnum;
import Factory.ContratoFactory;
import Factory.IContrato;
import Memento.LocacaoCareTaker;
import Memento.OriginatorLocacao;
import Model.*;
import Singleton.HistoricoSingleton;
import java.util.Date;

public class Arquitetura_projetos_ces {

    public static void main(String[] args) {
        System.out.println("##########################################");
        System.out.println("##################### FACTORY");
        ContratoFactory contratoFactory = new ContratoFactory();
                       
        IContrato c1 = contratoFactory.obterContrato(ContratoEnum.CONTRATO_CARRO_GRANDE);;
        Contrato c = c1.gerarContrato();
        System.out.println("\n");
            
        c1 = contratoFactory.obterContrato(ContratoEnum.CONTRATO_CARRO_MEDIO);
        c = c1.gerarContrato();
        System.out.println("\n");
            
        c1 = contratoFactory.obterContrato(ContratoEnum.CONTRATO_CARRO_PEQUENO);
        c = c1.gerarContrato();
        System.out.println("\n");
            
            
        //CONTROLLER
        System.out.println("CONTROLLER");
        Cliente cliente = new Cliente("321321321",25,15, "Joao","33333333333");
        AluguelController aluguelController = new AluguelController();
        System.out.println(
            aluguelController.prepararLocacaoVeiculo(cliente, ContratoEnum.CONTRATO_CARRO_MEDIO)
        );
            
        // SINGLETON
        System.out.println("\n");
        System.out.println("##########################################");
        System.out.println("##################### SINGLETON");
        HistoricoSingleton.obterInstanciaHistorio()
                .setItemHistorico(new HistoricoDto("Sinio", "Medeira", "Gol", new Date()));
 
        
        System.out.println("Total de itens no historico: " + HistoricoSingleton.obterInstanciaHistorio()
                                                 .getItensHistorico().size());
        
        HistoricoSingleton.obterInstanciaHistorio().getItensHistorico().forEach((t) -> {
            System.out.println("\n");
            System.out.println("#################");
            System.out.println("Cliente: " + t.getNomeCliente());
            System.out.println("Data: " + t.getDataLocacao());
            System.out.println("#################");
        });
        
     
        //Strategy + Command (Com Factory de contrato e Singleton de histórico)
        System.out.println("\n");
        System.out.println("##########################################");
        System.out.println("##################### STRATEGY + COMMAND");
        //Exemplo 1
        Carro cT = new Carro();
        cT.setCategoria("A");
        cT.setPlaca("1234F");
        cT.setModelo("Modelo1");
        cT.setAnoCarro("2016");
        cT.setCor("Vermelho");
        cT.setMultaVeiculo(0);
        Cliente clienteT = new Cliente("121212",25,15, "Guilherme","11111111111");
        
        //CONTROLLER
        System.out.println("CONTROLLER");
        
        
        Locacao locacaoUm = null;
        if(aluguelController.prepararLocacaoVeiculo(clienteT, ContratoEnum.CONTRATO_CARRO_MEDIO).equals("ALUGAR CARRO")){
           locacaoUm = clienteT.executarLocacao(200, cT, new Command.LocacaoPagamentoCartaoCredito()); 
        }
        
        
        //Exemplo 2
        Carro cT2 = new Carro();
        cT2.setCategoria("C");
        cT2.setPlaca("F4321");
        cT2.setModelo("Modelo2");
        cT2.setAnoCarro("2017");
        cT2.setCor("Preto");
        cT2.setMultaVeiculo(0);
        Cliente clienteT2 = new Cliente("212121",25,15, "Maicon","22222222222");
        
        
        Locacao locacaoDois = null;
        if(aluguelController.prepararLocacaoVeiculo(clienteT2, ContratoEnum.CONTRATO_CARRO_GRANDE).equals("ALUGAR CARRO")){
           locacaoDois = clienteT2.executarLocacao(550, cT2, new Command.LocacaoPagamentoCartaoDebito()); 
        }
        
        
        
        //Memento utilizando Locacao do Strategy + Command
        System.out.println("\n");
        System.out.println("##########################################");
        System.out.println("##################### MEMENTO");

        OriginatorLocacao originator = new OriginatorLocacao();
        LocacaoCareTaker careTaker = new LocacaoCareTaker();

        originator.setEstadoLocacao(new Locacao("Stub locacao"));
        originator.setEstadoLocacao(locacaoUm);
        careTaker.add(originator.salvarEstadoLocacaoMemento());

        originator.setEstadoLocacao(locacaoDois);
        careTaker.add(originator.salvarEstadoLocacaoMemento());

        originator.setEstadoLocacao(new Locacao("stub locacao Dois"));
        System.out.println("Estado Atual: " + originator.getEstadoLocacao());

        System.out.println("\n############");
        System.out.println("Todos estados de locacoes salvos");
        careTaker.todosEstados().forEach( locacaoMemento -> System.out.println(locacaoMemento.getEstadoLocacao()));
        careTaker.desfazerLocacao();
        System.out.println("\n############");
        System.out.println("Removido ultima locacao");
        careTaker.todosEstados().forEach( locacaoMemento -> System.out.println(locacaoMemento.getEstadoLocacao()));

        // SINGLETON ATUALIZADO
        System.out.println("\n");
        System.out.println("##########################################");
        System.out.println("##################### SINGLETON ATUALIZADO - EXIBINDO HISTORICO DAS LOCACOES NOVAS");
        
 
        
        System.out.println("Total de itens no historico: " + HistoricoSingleton.obterInstanciaHistorio()
                                                 .getItensHistorico().size());
        
        HistoricoSingleton.obterInstanciaHistorio().getItensHistorico().forEach((t) -> {
            System.out.println("\n");
            System.out.println("#################");
            System.out.println("Cliente: " + t.getNomeCliente());
            System.out.println("Data: " + t.getDataLocacao());
            System.out.println("#################");
        });
    
    
    
    
    }
    
}
