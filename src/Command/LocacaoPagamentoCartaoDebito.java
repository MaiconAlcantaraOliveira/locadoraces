/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Model.Locacao;

/**
 *
 * @author Guilherme
 */
public class LocacaoPagamentoCartaoDebito implements LocacaoPagamentoCommand{
    @Override
    public void processarLocacao(Locacao loca) {
        System.out.println("Locacao debitada!\n" + loca.getInfoLoca());
    }
}
