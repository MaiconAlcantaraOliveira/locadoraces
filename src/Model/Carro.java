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
    private Integer ano;

    @Override
    public String exibirInformacoesCarro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String exibirInformacoesContratoCarro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
