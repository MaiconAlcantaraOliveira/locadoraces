/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Command.PagamentoCommand;
import Strategy.CalculaDescontoLocacao;
import Strategy.CalculoDescontoQuinzeOuDez;
import Strategy.CalculoDescontoVinteOuQuinze;


/**
 *
 * @author Guilherme
 */
public class Locacao {
    private Carro carro;
    private double precoBase;
    private Cliente cliente;
    
    public Locacao(){
        
    }
    
    
    //Strategy
    protected CalculaDescontoLocacao estrategiaDeCalculo;
    public void determinarEstrategiaDeCalculo(){
        if(getCarro().getCategoria().equals("A") || getCarro().getCategoria().equals("B")){
            estrategiaDeCalculo = new CalculoDescontoQuinzeOuDez(); 
        }
        else{
            estrategiaDeCalculo = new CalculoDescontoVinteOuQuinze();
        }
    }
    
    public double calcularPrecoComDesconto() {
	return estrategiaDeCalculo.calculaPrecoComDesconto(this);
    }
    
    
    
    
    
    public String getInfoLoca() {
        return new String("Cliente: "+getCliente().getNome()+" Placa do carro: "+getCarro().getPlaca()+" Preco com desconto: " + calcularPrecoComDesconto()+" Preco base: "+getPrecoBase());
	
    }
    
    

    
    
    
    
    /*public void determinarEstrategiaDeCalculo(){
        double base = getSalarioBase();
        if(getCargo().equals("Gerente")){
            estrategiaDeCalculo = new CalculoImpostoQuinzeOuDez();  
        }
        else if(getCargo().equals("Funcionario")){
            estrategiaDeCalculo = new CalculoImpostoVinteOuQuinze();
        }
    }
       
    public double calcularPrecoComDesconto() {
	return estrategiaDeCalculo.calculaSalarioComImposto(this);
    } */

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
