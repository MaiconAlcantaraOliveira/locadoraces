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
public class CalculoDescontoVinteOuQuinze implements CalculaDescontoLocacao {
    @Override
    public double calculaPrecoComDesconto(Locacao umaLoca) {
        if (umaLoca.getPrecoBase() > 500) {
            return umaLoca.getPrecoBase() * 0.8;
        }
            return umaLoca.getPrecoBase() * 0.85;
    }
}
