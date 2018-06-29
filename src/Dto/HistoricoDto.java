/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dto;

import java.util.Date;

public class HistoricoDto {
    
    private String nomeCliente;
    private String nomeFuncionario;
    private String modeloCarro;
    private Date dataLocacao;

    public HistoricoDto(String nomeCliente, String nomeFuncionario, String modeloCarro, Date dataLocacao) {
        this.nomeCliente = nomeCliente;
        this.nomeFuncionario = nomeFuncionario;
        this.modeloCarro = modeloCarro;
        this.dataLocacao = dataLocacao;
    }

    public HistoricoDto() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }
    
    
    
    
    
}
