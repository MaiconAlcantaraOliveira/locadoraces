/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Factory.ICarro;

/**
 *
 * @author Sam
 */
public class Carro implements ICarro{
    
    private String modelo;
    private String anoCarro;
    private String categoria;
    private String placa;
    private String cor;
    private Integer multaVeiculo;

    public Carro(String modelo, String anoCarro, String categoria, String placa, String cor, Integer multaVeiculo) {
        this.modelo = modelo;
        this.anoCarro = anoCarro;
        this.categoria = categoria;
        this.placa = placa;
        this.cor = cor;
        this.multaVeiculo = multaVeiculo;
    }

    public Carro() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoCarro() {
        return anoCarro;
    }

    public void setAnoCarro(String anoCarro) {
        this.anoCarro = anoCarro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getMultaVeiculo() {
        return multaVeiculo;
    }

    public void setMultaVeiculo(Integer multaVeiculo) {
        this.multaVeiculo = multaVeiculo;
    }
    
    public Boolean hasVeiculoPermissaoParaLocacao() {
        if (this.multaVeiculo <= 25) 
            return true;
        return false;
    } 
    

    @Override
    public String exibirInformacoesCarro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String exibirInformacoesContratoCarro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
