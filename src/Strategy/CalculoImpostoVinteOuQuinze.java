/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import Model.Funcionario;

/**
 *
 * @author Guilherme
 */
public class CalculoImpostoVinteOuQuinze implements CalculaImpostoFuncionario{
    @Override
    public double calculaSalarioComImposto(Funcionario umFuncionario) {
        if (umFuncionario.getSalarioBase() > 3500) {
            return umFuncionario.getSalarioBase() * 0.8;
	}
	return umFuncionario.getSalarioBase() * 0.85;
    }
}
