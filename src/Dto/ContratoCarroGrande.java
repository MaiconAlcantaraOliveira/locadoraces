/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dto;

import Factory.IContrato;
import Model.Contrato;

/**
 *
 * @author Sam
 */
public class ContratoCarroGrande extends Contrato implements IContrato {
    
    private Integer a;
    private Integer b;

    @Override
    public Contrato gerarContrato() {
        System.out.println("CARRO GRANDE"); 
        Contrato c = new Contrato();
        c.setTaxaCarro(20.2);
        c.setSeguro(40);
        return c;   
    }

    
    
    

    
}
