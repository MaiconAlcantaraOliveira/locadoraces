/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Strategy.CalculaDescontoLocacao;
import Strategy.CalculoDescontoQuinzeOuDez;
import Strategy.CalculoDescontoVinteOuQuinze;


/**
 *
 * @author Guilherme
 */
public class Locacao {
    private String id;
    private Carro carro;
    private double precoBase;
    private Cliente cliente;
    
    public Locacao(){
        
    }

    public Locacao(String id){
        this.id = id;
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

    @Override
    public String toString() {
        return "\n" +"Locacao{" +
                "id='" + id + '\'' +
                ", carro=" + carro +
                ", precoBase=" + precoBase +
                ", cliente=" + cliente +
                ", estrategiaDeCalculo=" + estrategiaDeCalculo + "" +
                '}';
    }
}
