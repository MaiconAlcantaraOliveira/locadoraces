/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dto;

/**
 *
 * @author vinic
 */
public class AluguelDTO {
    
    private String nomeFuncionario;
    private String nomeCliente;
    private String contrato;

    public AluguelDTO(String nomeFuncionario, String nomeCliente, String contrato) {
        this.nomeFuncionario = nomeFuncionario;
        this.nomeCliente = nomeCliente;
        this.contrato = contrato;
    }

    public AluguelDTO() {
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

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
    
    
    
    
}
