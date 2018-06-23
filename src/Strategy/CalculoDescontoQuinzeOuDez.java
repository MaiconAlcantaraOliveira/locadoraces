/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Model.Locacao;

/**
 *
 * @author Guilherme
 */
public class CalculoDescontoQuinzeOuDez implements CalculaDescontoLocacao {
    
    @Override
    public double calculaPrecoComDesconto(Locacao umaLoca) {
        if (umaLoca.getPrecoBase() > 200) {
            return umaLoca.getPrecoBase() * 0.85;
        }
            return umaLoca.getPrecoBase() * 0.9;
    }
    
}