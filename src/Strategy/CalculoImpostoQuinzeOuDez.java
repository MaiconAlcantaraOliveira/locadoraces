/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Model.Funcionario;

public class CalculoImpostoQuinzeOuDez implements CalculaImpostoFuncionario {
    @Override
    public double calculaSalarioComImposto(Funcionario umFuncionario) {
        if (umFuncionario.getSalarioBase() > 2000) {
            return umFuncionario.getSalarioBase() * 0.85;
        }
            return umFuncionario.getSalarioBase() * 0.9;
    }
}
