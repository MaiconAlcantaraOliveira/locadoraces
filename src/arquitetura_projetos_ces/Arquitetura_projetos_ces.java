/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitetura_projetos_ces;

import Controller.AluguelController;
import Dto.HistoricoDto;
import Dto.TextoContrato;
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
            ContratoFactory contratoFactory = new ContratoFactory();
            
            // FACTORY DE CONTRATOS, NESSE CASO ABSTRAIR OS 3 TIPOS DE CONTRATOS EM UM, A MODIFICAÇÃO
            // DEVE SER FEITA EM CADA CLASSE ESPECIALIZADA E RETORNADA NO CONTRATO GLOBAL 
            
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
        Cliente cliente = new Cliente("cnh",25,15, "jout jout","cpf");
        AluguelController aluguelController = new AluguelController();
        System.out.println(
            aluguelController.alugarVeiculo(cliente, ContratoEnum.CONTRATO_CARRO_MEDIO)
        );
            
        // SINGLETON
        HistoricoSingleton.obterInstanciaHistorio()
                .setItemHistorico(new HistoricoDto("no main", "madeira", "vovo", new Date()));
 
        //Caso tenha dois itens no historicos, singleton esta ok 
        System.out.println("itens historico: " + HistoricoSingleton.obterInstanciaHistorio()
                                                 .getItensHistorico().size());
        
        HistoricoSingleton.obterInstanciaHistorio().getItensHistorico().forEach((t) -> {
            System.out.println("\n");
            System.out.println("#################");
            System.out.println("novoModelo: " + t.getModeloCarro());
             System.out.println("novoFunc: " + t.getNomeFuncionario());
              System.out.println("novCliente: " + t.getNomeCliente());
               System.out.println("novaData: " + t.getDataLocacao());
                System.out.println("#################");
        });
        
        /*
        //Strategy
        System.out.println("\n");
        System.out.println("##########################################");
        System.out.println("##################### Strategy");
        Funcionario fun1 = new Funcionario();
        fun1.setNome("Guilherme");
        fun1.setCargo("Funcionario");
        fun1.setSalarioBase(4000);
        fun1.determinarEstrategiaDeCalculo();
        System.out.println("Salário final do "+fun1.getCargo()+" "+fun1.getNome()+": "+fun1.calcularSalarioComImposto());
        Funcionario fun2 = new Funcionario();
        fun2.setNome("Vinicius");
        fun2.setCargo("Gerente");
        fun2.setSalarioBase(4000);
        fun2.determinarEstrategiaDeCalculo();
        System.out.println("Salário final do "+fun2.getCargo()+" "+fun2.getNome()+": "+fun2.calcularSalarioComImposto());
        Funcionario fun3 = new Funcionario();
        fun3.setNome("Rafael");
        fun3.setCargo("Sem cargo");
        fun3.setSalarioBase(4000);
        fun3.determinarEstrategiaDeCalculo();
        System.out.println("Salário final do "+fun3.getCargo()+" "+fun3.getNome()+": "+ fun3.getSalarioBase());
        

        //Command
        System.out.println("\n");
        System.out.println("##########################################");
        System.out.println("##################### Command");
        cliente.executarCompra(99.00, new PagamentoCartaoCredito());
        Cliente cliente2 = new Cliente("cnh",25,15, "Maicon","cpf");
        cliente2.executarCompra(120.00, new PagamentoBoleto());
        Cliente cliente3 = new Cliente("cnh",25,15, "Teste","cpf");
        cliente3.executarCompra(140.00, new PagamentoCartaoDebito());
        */
        
        
        //Strategy + Command
        //Ainda não está 100% implementado o main
        Carro cT = new Carro(); //carro de teste, a ideia é pegar um carro já instanciado previamente, mas aqui estou instanciando um novo apenas para fazer o código funcionar
        cT.setCategoria("A"); //categoria para poder calcular o desconto do carro
        cT.setPlaca("1234F");
        Cliente clienteT = new Cliente("cnh",25,15, "Teste","cpf"); //cliente de teste, a ideia é pegar um cliente já instanciando previamente, assim como no carro
        Locacao locacaoUm =
                clienteT.executarLocacao(200, cT, new Command.LocacaoPagamentoCartaoCredito());
        
        //exemplo 2
        Carro cT2 = new Carro();
        cT2.setCategoria("C");
        cT2.setPlaca("F4321");
        Cliente clienteT2 = new Cliente("cnh",25,15, "Maicon","cpf");
        Locacao locacaoDois =
        clienteT2.executarLocacao(550, cT2, new Command.LocacaoPagamentoCartaoDebito());
        


        //Memento
//        System.out.println("\n");
//        System.out.println("##########################################");
//        System.out.println("##################### MEMENTO");
//        TextoContrato textoContrato = new TextoContrato();
//        textoContrato.escreverTexto("Primeira linha do texto do contrato \n");
//        textoContrato.escreverTexto("Segunda linha do texto do contrato\n");
//        textoContrato.escreverTexto("Terceira linha do texto do contrato\n");
//        textoContrato.mostrarTexto();
//        textoContrato.desfazerEscrita();
//        textoContrato.mostrarTexto();
//        textoContrato.desfazerEscrita();
//        textoContrato.mostrarTexto();
//        textoContrato.desfazerEscrita();
//        textoContrato.mostrarTexto();
//        textoContrato.desfazerEscrita();
//        textoContrato.mostrarTexto();


        //Memento utilizando Locacao do Strategy + command
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
//
//        originator.getEstadoLocacaoMemento(careTaker.get(0));
//        System.out.println("Primeiro Estado Salvo: " + originator.getEstadoLocacao());
//        originator.getEstadoLocacaoMemento(careTaker.get(1));
//        System.out.println("Segundo estado salvo: " + originator.getEstadoLocacao());

        System.out.println("\n############");
        System.out.println("Todos estados de locacoes salvos");
        careTaker.todosEstados().forEach( locacaoMemento -> System.out.println(locacaoMemento.getEstadoLocacao())  );
        careTaker.desfazerLocacao();
        System.out.println("\n############");
        System.out.println("Removido ultima locacao");
        careTaker.todosEstados().forEach( locacaoMemento -> System.out.println(locacaoMemento.getEstadoLocacao())  );

    }
    
}
