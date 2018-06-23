/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitetura_projetos_ces;

import Command.PagamentoBoleto;
import Command.PagamentoCartaoCredito;
import Command.PagamentoCartaoDebito;
import Controller.AluguelController;
import Dto.ContratoDto;
import Dto.HistoricoDto;
import Dto.TextoContrato;
import Enum.ContratoEnum;
import Factory.ContratoFactory;
import Factory.IContrato;
import Model.Cliente;
import Model.Contrato;
import Model.Funcionario;
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


        //Memento
        System.out.println("\n");
        System.out.println("##########################################");
        System.out.println("##################### MEMENTO");
        TextoContrato textoContrato = new TextoContrato();
        textoContrato.escreverTexto("Primeira linha do texto do contrato \n");
        textoContrato.escreverTexto("Segunda linha do texto do contrato\n");
        textoContrato.escreverTexto("Terceira linha do texto do contrato\n");
        textoContrato.mostrarTexto();
        textoContrato.desfazerEscrita();
        textoContrato.mostrarTexto();
        textoContrato.desfazerEscrita();
        textoContrato.mostrarTexto();
        textoContrato.desfazerEscrita();
        textoContrato.mostrarTexto();
        textoContrato.desfazerEscrita();
        textoContrato.mostrarTexto();

    }
    
}
