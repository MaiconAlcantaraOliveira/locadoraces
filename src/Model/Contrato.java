/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Factory.IContrato;
import Memento.ContratoCareTaker;

public class Contrato{
    
    private String titulo;
    private String nomeFuncionario;
    private String nomeCliente;
    private Double taxaCarro;
    private Integer seguro;
    ContratoCareTaker careTaker;

    public Contrato(String titulo, String nomeFuncionario, String nomeCliente) {
        this.careTaker = new ContratoCareTaker();
        this.titulo = titulo;
        this.nomeFuncionario = nomeFuncionario;
        this.nomeCliente = nomeCliente;
    }

    public Contrato() {
        this.careTaker = new ContratoCareTaker();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getTaxaCarro() {
        return taxaCarro;
    }

    public void setTaxaCarro(Double taxaCarro) {
        this.taxaCarro = taxaCarro;
    }

    public Integer getSeguro() {
        return seguro;
    }

    public void setSeguro(Integer seguro) {
        this.seguro = seguro;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "titulo='" + titulo + '\'' +
                ", nomeFuncionario='" + nomeFuncionario + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", taxaCarro=" + taxaCarro +
                ", seguro=" + seguro +
                '}';
    }
}
