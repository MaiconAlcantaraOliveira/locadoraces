package Model;

import strategy.CalculaImpostoFuncionario;
import strategy.CalculoImpostoQuinzeOuDez;
import strategy.CalculoImpostoVinteOuQuinze;


public class Funcionario extends Pessoa{
       
    private String matricula;
    //private String tipoFuncionario;
    
    public Funcionario(String matricula, String cargo, double salarioBase, String nome, String cpf) {
        super(nome, cpf);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public Funcionario() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /*public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }*/   
    
    
    
    //Strategy
    private double salarioBase;
    protected CalculaImpostoFuncionario estrategiaDeCalculo;
    private String cargo;
    
    
    public void determinarEstrategiaDeCalculo(){
        double base = getSalarioBase();
        if(getCargo().equals("Gerente")){
            estrategiaDeCalculo = new CalculoImpostoQuinzeOuDez();  
        }
        else if(getCargo().equals("Funcionario")){
            estrategiaDeCalculo = new CalculoImpostoVinteOuQuinze();
        }
    }
       
    public double calcularSalarioComImposto() {
	return estrategiaDeCalculo.calculaSalarioComImposto(this);
    } 
    
    
    public double getSalarioBase() {
        return salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    
    
}
