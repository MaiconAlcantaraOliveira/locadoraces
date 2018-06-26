package Model;


public class Funcionario extends Pessoa{
       
    private String matricula;
    private double salarioBase;
    private String cargo;
    
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
