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
public interface CalculaDescontoLocacao {
   double calculaPrecoComDesconto(Locacao umaLoca); 
}
