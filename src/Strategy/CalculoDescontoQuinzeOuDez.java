/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Model.Locacao;

public class CalculoDescontoQuinzeOuDez implements CalculaDescontoLocacao {

    private Double valor;
    
    @Override
    public double calculaPrecoComDesconto(Locacao umaLoca) {
        if (umaLoca.getPrecoBase() > 200) {
            valor = umaLoca.getPrecoBase() * 0.85;
            return valor;
        }
            valor = umaLoca.getPrecoBase() * 0.9;
            return valor;
    }

    @Override
    public String toString() {
        return valor.toString();
    }
}
